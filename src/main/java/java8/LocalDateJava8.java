package java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;

/**
 * Created by Surendirababu Janarthanan on 2/1/2018.
 */
public class LocalDateJava8 {

    public static void main(String a[]) throws ParseException {

        LocalDate now = LocalDate.now();

        System.out.println("Now : "+now);

        System.out.println("Day of Month : "+now.getDayOfMonth());
        System.out.println("Month : "+now.getMonth());
        System.out.println("Month Value : "+now.getMonthValue());
        System.out.println("Day of Week : "+now.getDayOfWeek());
        System.out.println("Day of year : "+now.getDayOfYear());
        System.out.println("Era : "+now.getEra());


        System.out.println("------------------------------");
        //Ten Days After Current Day
        LocalDate tenDaysAfterCurrentDate = now.plusDays(10);
        System.out.println("Day of Month : "+tenDaysAfterCurrentDate.getDayOfMonth());
        System.out.println("Month : "+tenDaysAfterCurrentDate.getMonth());

        System.out.println("------------------------------");

        //Ten Days Before Current Day
        LocalDate tenDaysBeforeCurrentDate = now.minusDays(10);
        System.out.println("Day of Month : "+tenDaysBeforeCurrentDate.getDayOfMonth());
        System.out.println("Month : "+tenDaysBeforeCurrentDate.getMonth());

        System.out.println("------------------------------");

        System.out.println("Is before : "+now.isBefore(tenDaysBeforeCurrentDate));
        System.out.println("Is after : "+now.isAfter(tenDaysBeforeCurrentDate));

        System.out.println("------------------------------");

        System.out.println("Is before : "+now.isBefore(tenDaysAfterCurrentDate));
        System.out.println("Is after : "+now.isAfter(tenDaysAfterCurrentDate));

        LocalDate marriageDate = LocalDate.of(2017, Month.OCTOBER,30);
        System.out.println("My Marriage Date : "+ marriageDate);

        DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("My Marriage Date in dd/MM/yyyy format : " + dateTimeFormatter.format(marriageDate));


        /*

        OUTPUT:
        -------

        Day of Month : 1
        Month : FEBRUARY
        Month Value : 2
        Day of Week : THURSDAY
        Day of year : 32
        Era : CE
        ------------------------------
        Day of Month : 11
        Month : FEBRUARY
        ------------------------------
        Day of Month : 22
        Month : JANUARY
        ------------------------------
        Is before : false
        Is after : true
        ------------------------------
        Is before : true
        Is after : false

        */


    }
}
