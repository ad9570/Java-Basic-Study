import java.util.*;

class Ex02DateDifference {
	public static void main(String[] args) {
		// ������ 1���� �����ϱ� ������, DAY_OF_WEEK[0]�� ����ξ���.
		final String[] DAY_OF_WEEK = {"", "��", "��", "ȭ", "��", "��", "��", "��"};
 
		Calendar date = Calendar.getInstance();
		Calendar today = Calendar.getInstance();

		// month�� ��� 0���� �����ϱ� ������ 3���� ���, 2�� �����ؾ��Ѵ�.
		// date1.set(2022, Calendar.MARCH, 14);�� ���� �� ���� �ִ�.
		date.set(2022, 2, 14); // 2022�� 3�� 14�Ϸ� ��¥�� �����Ѵ�.
		System.out.println("date�� " + toString(date) + DAY_OF_WEEK[date.get(Calendar.DAY_OF_WEEK)] + "�����̰�,");
		System.out.println("������ " + toString(today) + DAY_OF_WEEK[today.get(Calendar.DAY_OF_WEEK)] + "�����Դϴ�.");

	    // �� ��¥���� ���̸� ��������, getTimeInMillis() ���
		// TIME.getTimeInMillis() : TIME�� ����� �ð��� 1/1000��(�и���) ������ ���� ���·� ��ȯ�Ѵ�.
   		long difference = (today.getTimeInMillis() - date.getTimeInMillis()) / 1000;	// �и��� / 1000 = ��
		System.out.println("date���� ���ñ��� " + difference + "�ʰ� �������ϴ�.");
		System.out.println("�Ϸ� ����ϸ� " + difference / (24 * 60 * 60) + "���Դϴ�."); // 1�� = 24�ð� * 60�� * 60��
	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "�� " +
				(date.get(Calendar.MONTH) + 1)  + "�� " +
				date.get(Calendar.DATE) + "�� ";
	}
}