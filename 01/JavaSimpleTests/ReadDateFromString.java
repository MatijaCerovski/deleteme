import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ReadDateFromString {


    public static void main(String[] args) {

        String dateString = "2019-04-26T10:06:18.786+02:00";

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        ZonedDateTime date = ZonedDateTime.parse(dateString, dateTimeFormatter);


        //First month is 0
        System.out.println(date.getMonthValue());

        System.out.println(dateTimeFormatter.format(date));

    }
}
