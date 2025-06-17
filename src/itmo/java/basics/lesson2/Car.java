package itmo.java.basics.lesson2;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double engineVolume;
    private boolean isAutomatic;

    // конструктор без параметров
    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.engineVolume = 0.0;
        this.isAutomatic = false;
    }

    // конструктор со всеми параметрами
    public Car(String brand, String model, int year, double engineVolume, boolean isAutomatic) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engineVolume = engineVolume;
        this.isAutomatic = isAutomatic;
    }

    // геттеры и сеттеры
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", engineVolume=" + engineVolume +
                ", isAutomatic=" + isAutomatic +
                '}';
    }
}
