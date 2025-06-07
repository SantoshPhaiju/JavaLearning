package ExceptionHandling.CustomException;

public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException() {
            super("what do you want? you don't have money");
    }
}
