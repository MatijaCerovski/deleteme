import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReadDateFromString2 {


    public static void main(String[] args) {

        final String dateString = "22.04.2019 12:52:45";

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        LocalDateTime dateTime = LocalDateTime.parse(dateString, dateTimeFormatter);

        System.out.println(dateTime);
        System.out.println(dateTime.getMonthValue());



    }

}
