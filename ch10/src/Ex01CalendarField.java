import java.util.*;

class Ex01CalendarField {
    public static void main(String[] args) {
        // 기본적으로 현재날짜와 시간으로 설정된다.
        Calendar today = Calendar.getInstance();
        // 날짜 관련 필드
        System.out.println("년 : " + today.get(Calendar.YEAR));
        System.out.println("월(0~11) : " + today.get(Calendar.MONTH));
        System.out.println("월 : " + today.get(Calendar.MONTH) + 1);
        System.out.println("일 : " + today.get(Calendar.DATE));
        System.out.println("요일(1:일요일, ..., 7:토요일) : " + today.get(Calendar.DAY_OF_WEEK));
        System.out.println("연중 몇 째 주 : " + today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("월중 몇 째 주 : " + today.get(Calendar.WEEK_OF_MONTH));
        System.out.println("연중 몇 째 일 : " + today.get(Calendar.DAY_OF_YEAR));
        System.out.println("월중 몇 째 일 : " + today.get(Calendar.DAY_OF_MONTH));    // DATE와 같다.
        System.out.println("이 달의 몇 째 ?요일 : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("이 달의 말일 : " + today.getActualMaximum(Calendar.DATE));
        // 시간 관련 필드
        System.out.println("오전_오후(0:오전, 1:오후) : " + today.get(Calendar.AM_PM));
        System.out.println("시(12시) : " + today.get(Calendar.HOUR));
        System.out.println("시(24시) : " + today.get(Calendar.HOUR_OF_DAY));
        System.out.println("분 : " + today.get(Calendar.MINUTE));
        System.out.println("초 : " + today.get(Calendar.SECOND));
        System.out.println("1/1000초 : " + today.get(Calendar.MILLISECOND));
        System.out.println("TimeZone(1/1000초) : " + today.get(Calendar.ZONE_OFFSET));
        System.out.println("TimeZone(-12~+12) : " + (today.get(Calendar.ZONE_OFFSET) / (60 * 60 * 1000)));
    }
}