package enums;

public enum Day {
    SUNDAY("Sunday", "Aaitabar"),
    MONDAY("Monday", "Sombar"),
    TUESDAY("Tuesday", "Mangalbar"),
    WEDNESDAY("Wednesday", "Buddhabar"),
    THURSDAY("Thursday", "Behebar"),
    FRIDAY("Friday", "Sukrabar"),
    SATURDAY("Saturday", "Sanibar");

    private final String lowercase;
    private final String nepali;

    public String getLowercase() {
        return lowercase;
    }

    public String getNepali() {
        return nepali;
    }

    private Day(String lower, String nepali) {
        System.out.println("constructor called");
        this.lowercase = lower;
        this.nepali = nepali;
    }

    public String display() {
        return "Today is " + this.lowercase;
    }

}
