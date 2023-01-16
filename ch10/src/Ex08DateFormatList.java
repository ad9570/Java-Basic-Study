import java.util.*;
import java.text.*;

class Ex08DateFormatList {
	public static void main(String[] args) {
		Date today = new Date();

		SimpleDateFormat[] sdf = new SimpleDateFormat[12];

		sdf[0] = new SimpleDateFormat("G yyyy");
		sdf[1] = new SimpleDateFormat("yy-MM-dd");
		sdf[2] = new SimpleDateFormat("yyyy-M-d");
		sdf[3] = new SimpleDateFormat("''yy년 MMM d일 E요일");
		sdf[4] = new SimpleDateFormat("''yyyy년 MM월 dd일 E요일");
		sdf[5] = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		sdf[6] = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");

		sdf[7] = new SimpleDateFormat("오늘은 올 해의 D번째 날입니다.");
		sdf[8] = new SimpleDateFormat("오늘은 이 달의 d번째 날입니다.");
		sdf[9] = new SimpleDateFormat("오늘은 올 해의 w번째 주입니다.");
		sdf[10] = new SimpleDateFormat("오늘은 이 달의 W번째 주입니다.");
		sdf[11] = new SimpleDateFormat("오늘은 이 달의 F번째 E요일입니다.");

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < sdf.length; i++)
			sb.append(sdf[i].format(today)).append("\n");
		System.out.println(sb);
	}
}