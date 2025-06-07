package ExceptionHandling.CustomException;

public class BankAccount {
    private double balance;

    public BankAccount(double amount) {
        this.balance = amount;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException();
        }
        balance -= amount;
    }
}
