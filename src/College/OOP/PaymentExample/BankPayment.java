package College.OOP.PaymentExample;

public class BankPayment extends Payment {
    public BankPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Processing Bank Payment...");
        super.displayTransactionDetails();
    }
}
