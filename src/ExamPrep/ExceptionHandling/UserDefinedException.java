package ExamPrep.ExceptionHandling;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        try {
            int i = 20;
            int j = 0;

            if (j == 0) {
                throw new MyException("This is invalid");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

}
