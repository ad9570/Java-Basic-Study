import java.util.*;
import java.text.*;

@SuppressWarnings("all")
class Ex09ChangeDateFormat {
    public static void main(String[] args) {
        DateFormat df1 = new SimpleDateFormat("yyyy년 MM월 dd일");
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

        try {
            Date d = df1.parse("2022년 12월 30일");
            System.out.println(df2.format(d));

            df2.parse("2022-12-30");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}