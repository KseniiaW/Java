package itmo.java.basics.lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printPhrases();
        calculateExpressions();
        computeDivision();
        calculateProduct();
        readAndPrintNumbers();
        checkNumberParity();
    }

    // Задание 1: Вывод строк в заданном порядке
    public static void printPhrases() {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");
    }

    // Задание 2: Вычисление математических выражений
    public static void calculateExpressions() {
        System.out.println((46 + 10) * ((double)10 / 3));
        System.out.println(29 * 4 * (-15));
    }

    // Задание 3: Деление числа
    public static double computeDivision(int number) {
        return (double)(number / 10) / 10;
    }

    public static void computeDivision() {
        int number = 10500;
        System.out.println(computeDivision(number));
    }

    // Задание 4: Произведение чисел
    public static double calculateProduct(double a, double b, double c) {
        return a * b * c;
    }

    public static void calculateProduct() {
        System.out.println(calculateProduct(3.6, 4.1, 5.9));
    }

    // Задание 5: Ввод и вывод чисел
    public static void printNumbers(int first, int second, int third) {
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }

    public static void readAndPrintNumbers() {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        printNumbers(first, second, third);
        scanner.close();
    }

    // Задание 6: Проверка числа на четность и диапазон
    public static String checkNumber(int b) {
        if (b % 2 != 0) {
            return "Нечетное";
        } else {
            String result = "Четное";
            if (b > 100) {
                result += "\nВыход за пределы диапазона";
            }
            return result;
        }
    }

    public static void checkNumberParity() {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        System.out.println(checkNumber(b));
        scanner.close();
    }
}