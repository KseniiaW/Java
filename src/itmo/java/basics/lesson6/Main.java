package itmo.java.basics.lesson6;

public class Main {
    public static void main(String[] args) {
        testHuman();
        testInterfaceImplementation();
        testTruck();
        testParentChildClass();
        testExtendedUser();
    }

    private static void testHuman() {
        System.out.println("Задание 1");
        Human client = new Client("Иван", "Петров", "ТБанк");
        Human employee = new BankEmployee("Петр", "Сидоров", "ВТБ");

        client.displayInfo();
        employee.displayInfo();
        System.out.println();
    }

    private static void testInterfaceImplementation() {
        System.out.println("Задание 2");
        BankOperations clientWithOperations = new BankClientWithOperations("Игорь", "Титов", "Райффайзенбанк");
        clientWithOperations.performOperation();
        ((Human) clientWithOperations).displayInfo();
        System.out.println();
    }

    private static void testTruck() {
        System.out.println("Задание 3");
        Truck truck = new Truck(1000, "Volvo", 'B', 120.5f, 10, 20000);
        truck.outPut();
        truck.newWheels(12);
        System.out.println();
    }

    private static void testParentChildClass() {
        System.out.println("Задание 4");
        ChildClass child = new ChildClass();
        child.displayNumber();
        System.out.println();
    }

    public static void testExtendedUser() {
        System.out.println("Задание 5");
        ExtendedUser extendedUser = new ExtendedUser();
        extendedUser.getUserData();
        System.out.println();
    }

}