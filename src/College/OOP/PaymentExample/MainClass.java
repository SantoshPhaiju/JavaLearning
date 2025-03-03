package College.OOP.PaymentExample;

public class MainClass {
    public static void main(String[] args) {
        Payment firstPayment = new WalletPayment(20000);
        firstPayment.pay();
    }
}
