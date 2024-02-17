package meshalkin.generics;

public class App {
    public static void main(String[] args) {
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
