import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.*;
import java.text.*;
import java.lang.*;
import java.math.*;

public class ItsADate {


    //returns string, represents users birthday, requires precise formatting (TODO: make fault tolerant)
    public static String getBirthDate() {
        System.out.println("Enter birthday (mm-dd-YYYY):");
        Scanner scanner = new Scanner(System.in);
        String birthday = scanner.nextLine();
        return birthday;
    }


    public static void main(String[] args) {
        //gets today's date
        LocalDate today = LocalDate.now();

        //gets the user inputted birthdate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-d-yyyy");
        String birthDate = getBirthDate();

        //convert String to LocalDate
        LocalDate localDate = LocalDate.parse(birthDate, formatter);
        System.out.println(localDate.toString());

        //compare Dates
        Period period = Period.between(today, localDate);
        long diff = Math.abs(period.getDays());

        // assertEquals(diff, 6);

        //Create  variables
        double seconds = (period.getDays()*86400)+(period.getMonths()*2629743.8)+(period.getYears()*31556926);
        double minutes = seconds/60;
        double hours = minutes/60;
        double days =  hours/24;
        double weeks = days/7;
        double months = weeks/4.35;
        double years = months/12;
        double decades = years/10;
        double centuries = years/100;
        double millenniums = years/1000;

        System.out.printf("Seconds: %.0f\n",Math.abs(seconds));
        System.out.printf("Minutes: %.0f\n",Math.abs(minutes));
        System.out.printf("Hours: %.0f\n",Math.abs(hours));
        System.out.printf("Days: %.0f\n",Math.abs(days));
        System.out.printf("Weeks: %.0f\n",Math.abs(weeks));
        System.out.printf("Months: %.0f\n",Math.abs(months));
        System.out.printf("Years: %.0f\n",Math.abs(years));
        System.out.printf("Decades: %.0f\n",Math.abs(decades));
        System.out.printf("Centuries: %.0f\n",Math.abs(centuries));
        System.out.printf("Millenniums: %.0f\n",Math.abs(millenniums));

    }
}
