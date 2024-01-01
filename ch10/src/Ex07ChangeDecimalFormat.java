import java.text.*;

class Ex07ChangeDecimalFormat {
    public static void main(String[] args) {
        DecimalFormat df1 = new DecimalFormat("#,###.##");
        DecimalFormat df2 = new DecimalFormat("#.###E0");

        try {
            Number num = df1.parse("1,234,567.89");
            System.out.print("1,234,567.89" + " -> ");

            double d = num.doubleValue();
            System.out.print(d + " -> ");

            System.out.println(df2.format(num));

            System.out.println(Double.parseDouble(df2.format(num)));    // 지수 형식 문자열은 숫자로 변환 가능
            System.out.println(Double.valueOf(df2.format(num)));
            System.out.println(Double.parseDouble(df1.format(num)));    // 콤마(,) 형식 문자열은 숫자로 변환 불가능
            System.out.println(Double.valueOf(df1.format(num)));
        } catch (Exception e) {
			System.out.println(e.getMessage());
        }
    }
}