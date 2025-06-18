package itmo.java.basics.lesson4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    // Задание 1: Нечетные числа от 1 до 99
    public static void printOddNumbers(int start, int end) {
        for (int i = start; i <= end; i += 2) {
            System.out.println(i);
        }
    }

    public static void task1() {
        System.out.println("\nЗадание 1: Нечетные числа от 1 до 99");
        printOddNumbers(1, 99);
    }

    // Задание 2: Деление на 3, 5 или оба
    public static void printDivisibleNumbers(int start, int end) {
        System.out.print("Делится на 3: ");
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.print("\nДелится на 5: ");
        for (int i = start; i <= end; i++) {
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.print("\nДелится и на 3, и на 5: ");
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("\nЗадание 2: Деление на 3, 5 или оба");
        printDivisibleNumbers(1, 100);
    }

    // Задание 3: Сравнение суммы
    public static boolean checkSum(int a, int b, int c) {
        return (a + b) == c;
    }

    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nЗадание 3: Сравнение суммы");

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();

        System.out.println("Результат: " + checkSum(a, b, c));
    }

    // Задание 4: Проверка возрастания трех чисел
    public static boolean isIncreasingSequence(int a, int b, int c) {
        return (b > a) && (c > b);
    }

    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nЗадание 4: Проверка возрастания трех чисел");

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();

        System.out.println("Результат: " + isIncreasingSequence(a, b, c));
    }

    // Задание 5: Проверка первого или последнего элемента массива на 3
    public static boolean checkFirstOrLast(int[] array, int value) {
        return (array[0] == value) || (array[array.length - 1] == value);
    }

    public static void task5() {
        System.out.println("\nЗадание 5: Проверка массива на 3");
        int[] array = {3, -3, 7, 4, 5, 4, 3};

        System.out.println("array = " + java.util.Arrays.toString(array));
        System.out.println(checkFirstOrLast(array, 3));
    }

    // Задание 6: Проверка массива на наличие 1 или 3
    public static boolean containsValue(int[] array, int value1, int value2) {
        for (int num : array) {
            if (num == value1 || num == value2) {
                return true;
            }
        }
        return false;
    }

    public static void task6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nЗадание 6: Проверка на 1 или 3");

        int[] array = new int[6];
        System.out.println("Введите 6 чисел для массива:");

        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите число " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("array = " + java.util.Arrays.toString(array));
        System.out.println("Содержит 1 или 3: " + containsValue(array, 1, 3));
    }
}