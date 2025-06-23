package itmo.java.basics.lesson6;

public class BankClientWithOperations extends Client implements BankOperations {
    public BankClientWithOperations(String firstName, String lastName, String bankName) {
        super(firstName, lastName, bankName);
    }

    @Override
    public void performOperation() {
        System.out.println("Клиент выполняет банковскую операцию");
    }
}