package College.OOP.PaymentExample;

public class WalletPayment extends Payment {
    public WalletPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Initializing Wallet Payment...");
        super.displayTransactionDetails();
    }
}
