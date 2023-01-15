import java.util.*;

class Ex03TimeDifference {
	public static void main(String[] args) {
		final String[] TIME_UNIT = {"초 ", "분 ", "시간 "};

		Calendar time = Calendar.getInstance();
		Calendar now = Calendar.getInstance();

		time.set(Calendar.HOUR_OF_DAY, 11); // time을 11시 11분 11초로 설정
		time.set(Calendar.MINUTE, 11);
		time.set(Calendar.SECOND, 11);

		System.out.println("time : " + time.get(Calendar.HOUR_OF_DAY) + "시 "
				+ time.get(Calendar.MINUTE) + "분 " + time.get(Calendar.SECOND) + "초");
		System.out.println("now : " + now.get(Calendar.HOUR_OF_DAY) + "시 "
				+ now.get(Calendar.MINUTE) + "분 " + now.get(Calendar.SECOND) + "초");

		long difference = Math.abs(now.getTimeInMillis() - time.getTimeInMillis()) / 1000;
		System.out.println("now와 time의 차이는 " + difference + "초 입니다.");

		StringBuilder tmp = new StringBuilder();
		for (int i = TIME_UNIT.length - 1; i >= 0; i--) { 	// 큰 단위를 먼저 계산한다.
			int scale = (int) Math.pow(60, i);
			tmp.append(difference / scale).append(TIME_UNIT[i]);
			difference %= scale;
		} 
		System.out.println("시분초로 변환하면 " + tmp + "입니다.");
	}
}