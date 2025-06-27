package itmo.java.basics.lesson6;

public class ExtendedUser extends User {
    @Override
    public void getUserData() {
        System.out.print("Введите имя: ");
        String name = scanner.next();
        System.out.println("Имя: " + name);
    }
}