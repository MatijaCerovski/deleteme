import java.math.BigDecimal;

public class SringToBigDecimal {

    public static void main(String[] args) {

        String number = "-1600.05";

        BigDecimal numericNumber = new BigDecimal(number);

        System.out.println("numericNumber = " + numericNumber);

    }
}
