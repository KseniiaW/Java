package itmo.java.basics.lesson6;

import java.util.Scanner;

public class ParentClass {
    protected int number;

    public ParentClass() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        this.number = scanner.nextInt();
    }
}
