package WrapperClasses;

public class MainClass {
    public static void main(String[] args) {
        int a = 4;
        Integer b = 4;

        b.toString();
        System.out.println(b.equals(a));
        // Integer, String, Boolean, Float, Double, Character, Byte, Short, Long

        // wrapper classes are used when we need to change primitive data types into objects

        boolean hasGraphicCard = false;
        Boolean isAdult = true;
        Float f = 1.2F;
        Double d = 1.2D;
        Character c = 'a';
        Byte bb = 1;
        Short s= 2;
        Long l = 33432L;
        String str = "123";
        System.out.println(Integer.parseInt(str) + 54);

        System.out.println(Integer.toBinaryString(70));
        System.out.println(hasGraphicCard + " " + isAdult + " " + f);
    }
}
