package patternPrinting;

public class FirstPattern {
    public static void main(String[] args) {
        // __*__
        // _***_
        // *****
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 3 - i; j++) {
                    System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                if(i % 2 != 0) {
                    System.out.print("*");
                }
            }
            if (i % 2 != 0) {
                System.out.println();
            }
        }
    }
}
