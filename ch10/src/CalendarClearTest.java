import java.util.Calendar;

public class CalendarClearTest {
	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();	// c1과 c2 사이에 밀리초 단위 차이 발생
		Calendar c2 = Calendar.getInstance();	// 코드가 순차적으로 실행이 되기 때문
		float difference;

		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);

		c1.set(2023, 0, 16);
		c2.set(2023, 0, 14);
		difference = (c1.getTimeInMillis() - c2.getTimeInMillis()) / (24 * 60 * 60 * 1000f);
		System.out.println("== Before clear ==");
		System.out.println("difference = " + difference);
		System.out.println("차이 : " + (int) difference + "일");

		c1.clear();	// clear()를 통해 모든 필드값을 초기화
		c2.clear();	// c1과 c2 사이의 밀리초 단위 차이를 없앰
		c1.set(2001, 0, 3);
		c2.set(2001, 0, 1);
		difference = (c1.getTimeInMillis() - c2.getTimeInMillis()) / (24 * 60 * 60 * 1000f);
		System.out.println("== After clear ==");
		System.out.println("difference = " + difference);
		System.out.println("차이 : " + (int) difference + "일");
	}
}
