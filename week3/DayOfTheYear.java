import java.time.LocalDate;

public class DayOfTheYear {
    public static int dayOfYear(String date) {
        return LocalDate.parse(date).getDayOfYear();
    }

    public static void main(String[] args) {
        System.out.println(dayOfYear("2019-01-09"));
        System.out.println(dayOfYear("2019-02-10"));
        System.out.println(dayOfYear("2003-03-01"));
        System.out.println(dayOfYear("2004-03-01"));
    }
}