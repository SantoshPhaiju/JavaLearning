package ExceptionHandling.CustomException;

public class MainClass {
    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount(3000);
        try {
            newAccount.withdraw(5000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
