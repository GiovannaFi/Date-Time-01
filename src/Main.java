import java.time.LocalDate;
import java.time.Year;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        //LocalDate today = LocalDate.of(2023,1,1);
        System.out.println("day " + today.getDayOfMonth());
        System.out.println("Month " + today.getMonth());
        System.out.println("Year " + today.getYear());

        int days = today.lengthOfMonth() - today.getDayOfMonth();
        System.out.println(days);

        Year year = java.time.Year.of(today.getYear());
        System.out.println(year.length());

        int daysDiff = year.length()- today.getDayOfYear();
        System.out.println(daysDiff);
    }
}