public class StringBuilderTest {
    public static void main(String[] args) {

        String price = "120.69";
        String currency = "HRK";

        StringBuilder sb = new StringBuilder();
        sb.append(price).append(" ").append(currency);

        System.out.println(sb);
    }
}
