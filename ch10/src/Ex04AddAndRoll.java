import java.util.*;

class Ex04AddAndRoll {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(2022, 7, 31);	// 2022년 8월 31일

		// add(필드, 값)는 다른 필드에 영향을 주며 증가/감소
		System.out.println(toString(date));
		System.out.println("== add : 1일 후 ==");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));

		System.out.println("== add : 9달 전 ==");
		date.add(Calendar.MONTH, -9);
		System.out.println(toString(date));

		// roll(필드, 값)은 다른 필드에 영향을 주지 않으며(값 범위 초과시 리셋) 증가/감소
		System.out.println("== roll : 7일 전 ==");
		date.roll(Calendar.DATE, -7);
		System.out.println(toString(date));

		System.out.println("== roll : 3달 후 ==");
		date.roll(Calendar.MONTH, 3);
		System.out.println(toString(date));
	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 "
				+ date.get(Calendar.DATE) + "일";
	}
}