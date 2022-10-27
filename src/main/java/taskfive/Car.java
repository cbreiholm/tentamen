package taskfive;

public class Car {
    public String color;
    public String brand;
    private static int numberOfCars;
    static int COUNTER;

    public Car(String color, String brand) {
        this.color = color;
        this.brand = brand;
        COUNTER++;
    }

    public Car() {
        COUNTER++;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
