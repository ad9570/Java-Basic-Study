public class RoundTest {

    public static void main(String[] args) {
        double sum = 0.0;
        double sum1 = 0.0;
        double sum2 = 0.0;

        for (double d = 0.5; d <= 11.5; d++) {
            double d1 = Math.round(d);
            double d2 = Math.rint(d);

            System.out.printf("d = %4.1f, d1 = %4.1f, d2 = %4.1f%n", d, d1, d2);

            sum += d;
            sum1 += d1;
            sum2 += d2;
        }

        System.out.printf("sum = %4.1f, sum1 = %4.1f, sum2 = %4.1f%n", sum, sum1, sum2);
    }

}
