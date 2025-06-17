package itmo.java.basics.lesson3;

public class Tree {
    private int age;
    private boolean isAlive;
    private String name;

    // без параметров
    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    // возраст и название
    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // все параметры
    public Tree(int age, boolean isAlive, String name) {
        this.age = age;
        this.isAlive = isAlive;
        this.name = name;
    }

    public void printTreeInfo() {
        System.out.println("Дерево: " + name);
        System.out.println("Возраст: " + age + " лет");
        System.out.println("Живое: " + (isAlive ? "Да" : "Нет"));
        System.out.println();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
