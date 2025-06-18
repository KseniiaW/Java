package itmo.java.basics.lesson2;

import itmo.java.basics.lesson2.Calculator;
import itmo.java.basics.lesson2.Car;

public class Main {
    public static void main(String[] args) {
        testCalculator();
        testCar();
    }

    private static void testCalculator() {
        Calculator calculator = new Calculator();
        double num1 = 10.5;
        double num2 = 2.5;

        System.out.println("Тестирование калькулятора:");
        System.out.println("Сумма: " + calculator.sum(num1, num2));
        System.out.println("Разность: " + calculator.subtract(num1, num2));
        System.out.println("Произведение: " + calculator.multiply(num1, num2));
        System.out.println("Частное: " + calculator.divide(num1, num2));
    }

    private static void testCar() {
        System.out.println("\nТестирование класса Car:");

        // Тест конструктора без параметров
        Car defaultCar = createDefaultCar();
        System.out.println("Автомобиль по умолчанию:\n" + defaultCar);

        // Тест полного конструктора
        Car mercedes = createMercedes();
        System.out.println("\nMercedes:\n" + mercedes);

        // Тест сеттеров
        Car updatedCar = updateCar(defaultCar);
        System.out.println("\nОбновлённый автомобиль:\n" + updatedCar);
    }

    private static Car createDefaultCar() {
        return new Car();
    }

    private static Car createMercedes() {
        return new Car("Mercedes", "Benz", 2024, 2.5, true);
    }

    private static Car updateCar(Car car) {
        car.setBrand("BMW");
        car.setModel("X5");
        car.setYear(2022);
        car.setEngineVolume(3.0);
        car.setAutomatic(true);
        return car;
    }
}