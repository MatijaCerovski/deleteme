import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class ReadDateFromString {


    public static void main(String[] args) throws ParseException {

        String dateString = "2019-04-26T10:06:18.786+02:00";

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        Date date = dateFormat.parse(dateString);
//        GregorianCalendar calendar = new GregorianCalendar();
//        calendar.setTime(date);

        //First month is 0
        System.out.println(date.getMonth());

        System.out.println(dateFormat.format(date));

    }
}
