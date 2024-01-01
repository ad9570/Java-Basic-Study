@SuppressWarnings("all")
public class ConvertTest {
    public static void main(String[] args) {
        int i10 = Integer.parseInt("100");
        int i2 = Integer.parseInt("100", 2);
        int i8 = Integer.parseInt("100", 8);
        int i16 = Integer.parseInt("FF", 16);

        System.out.println("i10 = " + i10);
        System.out.println("i2 = " + i2);
        System.out.println("i8 = " + i8);
        System.out.println("i16 = " + i16);

        try {
            int i = Integer.parseInt("FF");
            System.out.println("i = " + i);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}