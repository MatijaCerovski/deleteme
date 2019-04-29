import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        String number = "-455.99";
        String number2 = "-0.01";

        BigDecimal price = new BigDecimal(number);
        BigDecimal price2 = new BigDecimal(number2);

        System.out.println(price.add(price2));
    }
}
