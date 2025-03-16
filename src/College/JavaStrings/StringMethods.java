package College.JavaStrings;

public class StringMethods {
    public static void main(String[] args) {
        String name = "     santosh phaiju    ";
        System.out.println(name.trim());
        System.out.println(name.substring(0,6));
        System.out.println(name.replace('s', 'a'));

        StringBuffer sb = new StringBuffer("Hello World");
        sb.append(" k xa ");
        System.out.println(sb);

        sb.insert(13, "JAVA HEHEHEHEHE ");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}
