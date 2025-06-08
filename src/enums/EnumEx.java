package enums;

public class EnumEx {
    public static void main(String[] args) {
        System.out.println(DayClass.SUNDAY);
        System.out.println(Day.SUNDAY);
        System.out.println(Day.MONDAY);

        Day monday = Day.MONDAY;

        System.out.println(monday.name());
        Day enumDay = Day.valueOf("TUESDAY");
        System.out.println(enumDay);
        Day[] days = Day.values();
        System.out.println("List of the days: ");
        for (Day day : days) {
            System.out.println(day.display());
        }

        System.out.println(monday.getLowercase());
        System.out.println(monday.getNepali());
    }
}
