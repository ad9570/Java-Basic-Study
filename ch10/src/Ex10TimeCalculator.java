import java.util.*;
import java.text.*;

class Ex10TimeCalculator {
	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd"; 
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner s = new Scanner(System.in);

		Date inDate = null;

		System.out.println("��¥�� " + pattern + "�� ���·� �Է����ּ���.(�Է� �� : 2023/01/16)");
		while(s.hasNextLine()) {
			try {
				inDate = df.parse(s.nextLine());
				break;
			} catch(Exception e) {
				System.out.println("��¥�� " + pattern + "�� ���¿� �°� �Է����ּ���.(�Է� �� : 2023/01/16)");
			}
		}

		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		Calendar today = Calendar.getInstance();
		long day = (cal.getTimeInMillis() - today.getTimeInMillis()) / (60 * 60 * 1000);
		System.out.println("�Է��Ͻ� ��¥�� ������ �ð� ���̴� " + day + "�ð� �Դϴ�.");
	}
}