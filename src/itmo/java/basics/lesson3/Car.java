package itmo.java.basics.lesson3;

public class Car {
    private String color;
    private String name;
    private double weight;

    // пустой конструктор
    public Car() {
    }

    // только цвет
    public Car(String color) {
        this.color = color;
    }

    // цвет и вес
    public Car(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    // цвет, вес, бренд
    public Car(String color, String name, double weight) {
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    // метод для вывода данных
    public void printCarInfo() {
        System.out.println("Цвет: " + color);
        System.out.println("Название: " + name);
        System.out.println("Вес: " + weight + " кг");
        System.out.println();
    }

    // геттеры/сеттеры
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
