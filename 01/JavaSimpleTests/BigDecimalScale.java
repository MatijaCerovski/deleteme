import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalScale {

    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal("200.555555").setScale(3, RoundingMode.HALF_UP);
        BigDecimal number2 = new BigDecimal(20).setScale(2, RoundingMode.HALF_UP);

        BigDecimal number3 = new BigDecimal(20.55);



        System.out.println(number1.toString());
        System.out.println(number2.toString());
        System.out.println(number3.toString());
    }
}
