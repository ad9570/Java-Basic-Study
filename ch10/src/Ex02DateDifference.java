import java.util.*;

class Ex02DateDifference {
	public static void main(String[] args) {
		// 요일은 1부터 시작하기 때문에, DAY_OF_WEEK[0]은 비워두었다.
		final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};
 
		Calendar date = Calendar.getInstance();
		Calendar today = Calendar.getInstance();

		// month의 경우 0부터 시작하기 때문에 3월인 경우, 2로 지정해야한다.
		// date1.set(2022, Calendar.MARCH, 14);와 같이 할 수도 있다.
		date.set(2022, 2, 14); // 2022년 3월 14일로 날짜를 설정한다.
		System.out.println("date는 " + toString(date) + DAY_OF_WEEK[date.get(Calendar.DAY_OF_WEEK)] + "요일이고,");
		System.out.println("오늘은 " + toString(today) + DAY_OF_WEEK[today.get(Calendar.DAY_OF_WEEK)] + "요일입니다.");

	    // 두 날짜간의 차이를 얻으려면, getTimeInMillis() 사용
		// TIME.getTimeInMillis() : TIME에 저장된 시간을 1/1000초(밀리초) 단위의 정수 형태로 반환한다.
   		long difference = (today.getTimeInMillis() - date.getTimeInMillis()) / 1000;	// 밀리초 / 1000 = 초
		System.out.println("date부터 오늘까지 " + difference + "초가 지났습니다.");
		System.out.println("일로 계산하면 " + difference / (24 * 60 * 60) + "일입니다."); // 1일 = 24시간 * 60분 * 60초
	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " +
				(date.get(Calendar.MONTH) + 1)  + "월 " +
				date.get(Calendar.DATE) + "일 ";
	}
}