import java.util.*;
import java.text.*;

class Ex09ChangeDateFormat {
	public static void main(String[] args) {
		DateFormat df1 = new SimpleDateFormat("yyyy�� MM�� dd��");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

		try {
			Date d = df1.parse("2022�� 12�� 30��");
			System.out.println(df2.format(d));

			df2.parse("2022-12-30");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}