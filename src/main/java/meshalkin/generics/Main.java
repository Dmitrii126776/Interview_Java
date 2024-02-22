package meshalkin.generics;

public class Main {
    public static void main(String[] args) {
        Generics<Integer, Vehicle> integerVehicleGenerics = new Generics<>();

        Vehicle vehicle1 = new Vehicle("Toyota", 2020);
        Vehicle vehicle2 = new Vehicle("Mazda", 2021);
        Vehicle vehicle3 = new Vehicle("Nissan", 2022);

        integerVehicleGenerics.addToString(1, vehicle1);
        integerVehicleGenerics.addToString(2, vehicle2);
        integerVehicleGenerics.addToString(3, vehicle3);

        System.out.println(integerVehicleGenerics.getString());
        //  1 This is Toyota 2020 - 2 This is Mazda 2021 - 3 This is Nissan 2022

        Generics<Integer, String> integerStringGenerics = new Generics<>();

        integerStringGenerics.addToString(1, "One");
        integerStringGenerics.addToString(2, "Two");
        integerStringGenerics.addToString(3, "Three");

        System.out.println(integerStringGenerics.getString());
        // 1 One - 2 Two - 3 Three
        Generics<String, Integer> stringIntegerGenerics = new Generics<>();

        stringIntegerGenerics.addToString("One", 1);
        stringIntegerGenerics.addToString("Two", 2);
        stringIntegerGenerics.addToString("Three", 3);

        System.out.println(stringIntegerGenerics.getString());
        // One 1 - Two 2 - Three 3
    }
}
