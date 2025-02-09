package College;


/* *
* This is javadoc here for documentation
* @author santoshphaiju
*/

public class Chap2 {
    public static void main(String[] args) {


        float myFloat = 12.33f;
        double myDouble = 34.33D;

//        Arrays
        int[] myNumbers = {1, 2, 3, 4, 5, 6};
        int[] numbers = new int[20];

        NewEnum day = NewEnum.TUESDAY;

//        for (int number: myNumbers) {
//            System.out.println(number);
//            if(number == 4) {
//                return;
//            }
//            System.out.println("Hello");
//        }

        int i = 0;
        while ( i < 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("I am out");

    }
}
