package itmo.java.basics.lesson6;

public class BankEmployee extends Human {
    private String bankName;

    public BankEmployee(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public void displayInfo() {
        System.out.println("Работник банка: " + getFirstName() + " " + getLastName() +
                ", банк: " + bankName);
    }
}