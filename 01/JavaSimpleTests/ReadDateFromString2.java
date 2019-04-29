import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReadDateFromString2 {


    public static void main(String[] args) {

        final String dateString = "22.11.2019 12:52:45";

        DateTimeFormatter dateTimeInFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        DateTimeFormatter dateTimeOutFormatter = DateTimeFormatter.ofPattern("dd.M.yyyy.");

        LocalDateTime dateTime = LocalDateTime.parse(dateString, dateTimeInFormatter);

        System.out.println(dateTime);
        System.out.println(dateTime.getMonthValue());

        System.out.println(dateTime.format(dateTimeOutFormatter));




    }

}
