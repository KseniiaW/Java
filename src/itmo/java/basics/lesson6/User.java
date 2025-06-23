package itmo.java.basics.lesson6;

import java.util.Scanner;

public class User {
    protected Scanner scanner;

    public User() {
        scanner = new Scanner(System.in);
    }

    public void getUserData() {
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        System.out.println("Возраст: " + age);
    }
}