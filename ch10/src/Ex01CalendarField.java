import java.util.*;

class Ex01CalendarField {
	public static void main(String[] args) {
		// �⺻������ ���糯¥�� �ð����� �����ȴ�.
		Calendar today = Calendar.getInstance();
		// ��¥ ���� �ʵ�
		System.out.println("�� : " + today.get(Calendar.YEAR));
 	    System.out.println("��(0~11) : " + today.get(Calendar.MONTH));
 	    System.out.println("�� : " + today.get(Calendar.MONTH) + 1);
		System.out.println("�� : " + today.get(Calendar.DATE));
		System.out.println("����(1:�Ͽ���, ..., 7:�����) : " + today.get(Calendar.DAY_OF_WEEK));
	  	System.out.println("���� �� ° �� : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("���� �� ° �� : " + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("���� �� ° �� : " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("���� �� ° �� : " + today.get(Calendar.DAY_OF_MONTH));	// DATE�� ����.
	 	System.out.println("�� ���� �� ° ?���� : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("�� ���� ���� : " + today.getActualMaximum(Calendar.DATE));
		// �ð� ���� �ʵ�
		System.out.println("����_����(0:����, 1:����) : " + today.get(Calendar.AM_PM));
		System.out.println("��(12��) : " + today.get(Calendar.HOUR));
		System.out.println("��(24��) : " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("�� : " + today.get(Calendar.MINUTE));
		System.out.println("�� : " + today.get(Calendar.SECOND));
		System.out.println("1/1000�� : " + today.get(Calendar.MILLISECOND));
		System.out.println("TimeZone(1/1000��) : " + today.get(Calendar.ZONE_OFFSET));
		System.out.println("TimeZone(-12~+12) : " + (today.get(Calendar.ZONE_OFFSET) / (60 * 60 * 1000)));
	}
}