package ExceptionHandling.CustomException;

public class MainClass {
    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount(3000);
        try {
            newAccount.withdraw(5000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e);
        }
    }
}
