import java.util.*;
import java.text.*;

class Ex08DateFormatList {
	public static void main(String[] args) {
		Date today = new Date();

		SimpleDateFormat[] sdf = new SimpleDateFormat[12];

		sdf[0] = new SimpleDateFormat("G yyyy");
		sdf[1] = new SimpleDateFormat("yy-MM-dd");
		sdf[2] = new SimpleDateFormat("yyyy-M-d");
		sdf[3] = new SimpleDateFormat("''yy�� MMM d�� E����");
		sdf[4] = new SimpleDateFormat("''yyyy�� MM�� dd�� E����");
		sdf[5] = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		sdf[6] = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");

		sdf[7] = new SimpleDateFormat("������ �� ���� D��° ���Դϴ�.");
		sdf[8] = new SimpleDateFormat("������ �� ���� d��° ���Դϴ�.");
		sdf[9] = new SimpleDateFormat("������ �� ���� w��° ���Դϴ�.");
		sdf[10] = new SimpleDateFormat("������ �� ���� W��° ���Դϴ�.");
		sdf[11] = new SimpleDateFormat("������ �� ���� F��° E�����Դϴ�.");

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < sdf.length; i++)
			sb.append(sdf[i].format(today)).append("\n");
		System.out.println(sb);
	}
}