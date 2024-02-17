package meshalkin.generics;

public class Vehicle {
    private String model;
    private Integer year;


    public Vehicle(String model, Integer year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "This is " + model + " " + year;
//        return "Vehicle{" +
//                "model='" + model + '\'' +
//                ", year=" + year +
//                '}';
    }
}
