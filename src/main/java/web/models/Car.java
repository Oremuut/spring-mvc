package web.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {

    private String model;
    private String color;
    private int year;

    private static final List<Car> cars = new ArrayList<>(Arrays.asList(
            new Car("Model1", "Red", 1990),
            new Car("Model2", "Blue", 1995),
            new Car("Model3", "Green", 2000),
            new Car("Model4", "Black", 2005),
            new Car("Model5", "White", 2010)
    ));

    public Car() {}

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static List<Car> getCars() {
        return cars;
    }

}
