package itmo.java.basics.lesson6;

public class Client extends Human {
    private String bankName;

    public Client(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public void displayInfo() {
        System.out.println("Клиент: " + getFirstName() + " " + getLastName() +
                ", банк: " + bankName);
    }
}