package College.JavaStrings;

public class MyBuilder {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("  santosh phaiju  ");

        name.append(" is a Java Developer.");
        System.out.println("After append: " + name);

        name.reverse();
        System.out.println("After reverse: " + name);

        name.reverse();
        int start = 0, end = name.length() - 1;
        while (start <= end && name.charAt(start) == ' ') start++;
        while (end >= start && name.charAt(end) == ' ') end--;
        name = new StringBuilder(name.substring(start, end + 1));

        System.out.println("After trim: " + name);
    }
}
