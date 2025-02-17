package OOPS;

public class StaticExample {
/* Static method is just like calling Math.pow() or Math.max(),
  Math.min() -> where we don't have to create the object instance
 to access its properties or methods. */

    public static float PI = 3.1416F;
    private final String name = "Santosh Phaiju";

    public void getName() {
        System.out.println(name);
    }

    public void getName(String name) {
        System.out.println(name); 
    }

    public static void main(String[] args) {
        FunctionOverloading newOne = new FunctionOverloading();
        newOne.sum(1, 3);
        newOne.sum(4.33, 3.3333);
    }


}
