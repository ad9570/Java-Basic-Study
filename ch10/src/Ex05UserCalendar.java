import java.util.*;

class Ex05UserCalendar {
    public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Usage : java Ex05UserCalendar 2023 1");
			return;
		}
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		// 달력을 만들 때 필요한 것
		int END_DAY;                // 1. 말일
		int START_DAY_OF_WEEK;        // 2. 첫일의 요일

		Calendar sDay = Calendar.getInstance(); // 시작일
		Calendar eDay = Calendar.getInstance(); // 끝일

		// 월의 경우 0부터 11까지의 값을 가지므로 1을 빼주어야 한다.
		sDay.set(year, month - 1, 1);

		// 1. 말일 구하기
		// 다음달의 첫날에서 하루를 빼면 현재달의 마지막 날이 된다.
		eDay.set(year, month, 1);
		eDay.add(Calendar.DATE, -1);
		END_DAY = eDay.get(Calendar.DATE);

		// 2. 첫일의 요일 구하기
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);

		// 3. 달력 출력
		StringBuilder sb = new StringBuilder();

		sb.append("      ").append(year).append("년 ").append(month).append("월\n");
		sb.append(" SU MO TU WE TH FR SA\n");

		// 해당 월의 1일이 어느 요일인지에 따라서 공백을 출력한다.
		// 만일 1일이 수요일이라면 공백을 세 번 찍는다.(일요일부터 시작)
//		for (int i = 1; i < START_DAY_OF_WEEK; i++) {
//			sb.append("   ");
//		}
        sb.append("   ".repeat(START_DAY_OF_WEEK - 1));    // JDK 11 ~

        // 일 값(i)을 하나씩 증가시킴과 동시에 요일 값(n)도 하나씩 증가시킨다.
        // 요일 값(n)은 첫일의 요일 값으로 초기화한다.
        for (int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
            sb.append((i < 10) ? "  " + i : " " + i);
            if (n % 7 == 0) {
				sb.append("\n");
			}
        }

        System.out.println(sb);
    }
}