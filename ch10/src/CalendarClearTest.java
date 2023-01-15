import java.util.Calendar;

public class CalendarClearTest {
	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();	// c1�� c2 ���̿� �и��� ���� ���� �߻�
		Calendar c2 = Calendar.getInstance();	// �ڵ尡 ���������� ������ �Ǳ� ����
		float difference;

		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);

		c1.set(2023, 0, 16);
		c2.set(2023, 0, 14);
		difference = (c1.getTimeInMillis() - c2.getTimeInMillis()) / (24 * 60 * 60 * 1000f);
		System.out.println("== Before clear ==");
		System.out.println("difference = " + difference);
		System.out.println("���� : " + (int) difference + "��");

		c1.clear();	// clear()�� ���� ��� �ʵ尪�� �ʱ�ȭ
		c2.clear();	// c1�� c2 ������ �и��� ���� ���̸� ����
		c1.set(2001, 0, 3);
		c2.set(2001, 0, 1);
		difference = (c1.getTimeInMillis() - c2.getTimeInMillis()) / (24 * 60 * 60 * 1000f);
		System.out.println("== After clear ==");
		System.out.println("difference = " + difference);
		System.out.println("���� : " + (int) difference + "��");
	}
}
