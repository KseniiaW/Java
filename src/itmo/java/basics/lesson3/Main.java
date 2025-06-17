package itmo.java.basics.lesson3;

public class Main {
    public static void main(String[] args) {
        testStudy();
        testCars();
        testHouses();
        testTrees();
    }

    private static void testStudy() {
        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());
        System.out.println();
    }

    private static void testCars() {
        System.out.println("=== Cars ===");
        Car car1 = createCarWithAllParams();
        Car car2 = createCarWithSetters();

        car1.printCarInfo();
        car2.printCarInfo();
    }

    private static void testHouses() {
        System.out.println("=== Houses ===");
        House house1 = createHouse1();
        House house2 = createHouse2();

        house1.printHouseInfo();
        house2.printHouseInfo();
    }

    private static void testTrees() {
        System.out.println("=== Trees ===");
        Tree tree1 = createTree1();
        Tree tree2 = createTree2();
        Tree tree3 = createTree3();

        tree1.printTreeInfo();
        tree2.printTreeInfo();
        tree3.printTreeInfo();
    }

    // методы
    private static Car createCarWithAllParams() {
        return new Car("Желтый", "BMW", 2500.5);
    }

    private static Car createCarWithSetters() {
        Car car = new Car();
        car.setColor("Черный");
        car.setName("Toyota");
        car.setWeight(1000.0);
        return car;
    }

    private static House createHouse1() {
        House house = new House();
        house.setHouseData(75, 2015, "Мурино");
        return house;
    }

    private static House createHouse2() {
        House house = new House();
        house.setHouseData(5, 1965, "Петроградка");
        return house;
    }

    private static Tree createTree1() {
        Tree tree = new Tree();
        tree.setAge(30);
        tree.setAlive(true);
        tree.setName("Дуб");
        return tree;
    }

    private static Tree createTree2() {
        return new Tree(50, "Клен");
    }

    private static Tree createTree3() {
        return new Tree(120, true, "Бамбук");
    }
}