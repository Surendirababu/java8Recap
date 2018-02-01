package java8;

import java.time.LocalDate;
import java.time.temporal.TemporalField;

/**
 * Created by Surendirababu Janarthanan on 2/1/2018.
 */
public class LocalDateJava8 {

    public static void main(String a[])
    {

        LocalDate localDate = LocalDate.now();

        System.out.println("Day of Month : "+localDate.getDayOfMonth());
        System.out.println("Month : "+localDate.getMonth());
        System.out.println("Month Value : "+localDate.getMonthValue());
        System.out.println("Day of Week : "+localDate.getDayOfWeek());
        System.out.println("Day of year : "+localDate.getDayOfYear());
        System.out.println("Era : "+localDate.getEra());


    }
}
