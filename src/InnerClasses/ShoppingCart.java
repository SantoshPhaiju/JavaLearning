package InnerClasses;

public class ShoppingCart {
    private double totalAmount;

    public ShoppingCart(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void processPayment(Payment paymentMethod) {
        paymentMethod.pay(totalAmount);
    }
}
