package enums;

public class EnumEx {

    private enum Months {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER;
    }


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

        Day day = Day.MONDAY;
        switch (day) {
            case MONDAY:
                System.out.println("M");
                break;
            case TUESDAY:
                System.out.println("TUESDAY");
                break;
            case WEDNESDAY:
                System.out.println("WEDNESDAY");
                break;
            case THURSDAY:
                System.out.println("THURSDAY");
                break;
            case FRIDAY:
                System.out.println("FRIDAY");
                break;
            case SATURDAY:
                System.out.println("SATURDAY");

                break;
            case SUNDAY:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("Weekend");
                break;
        }

        System.out.println(Months.MAY);
    }

}
