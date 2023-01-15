import java.util.*;

class Ex03TimeDifference {
	public static void main(String[] args) {
		final String[] TIME_UNIT = {"�� ", "�� ", "�ð� "};

		Calendar time = Calendar.getInstance();
		Calendar now = Calendar.getInstance();

		time.set(Calendar.HOUR_OF_DAY, 11); // time�� 11�� 11�� 11�ʷ� ����
		time.set(Calendar.MINUTE, 11);
		time.set(Calendar.SECOND, 11);

		System.out.println("time : " + time.get(Calendar.HOUR_OF_DAY) + "�� "
				+ time.get(Calendar.MINUTE) + "�� " + time.get(Calendar.SECOND) + "��");
		System.out.println("now : " + now.get(Calendar.HOUR_OF_DAY) + "�� "
				+ now.get(Calendar.MINUTE) + "�� " + now.get(Calendar.SECOND) + "��");

		long difference = Math.abs(now.getTimeInMillis() - time.getTimeInMillis()) / 1000;
		System.out.println("now�� time�� ���̴� " + difference + "�� �Դϴ�.");

		StringBuilder tmp = new StringBuilder();
		for (int i = TIME_UNIT.length - 1; i >= 0; i--) { 	// ū ������ ���� ����Ѵ�.
			int scale = (int) Math.pow(60, i);
			tmp.append(difference / scale).append(TIME_UNIT[i]);
			difference %= scale;
		} 
		System.out.println("�ú��ʷ� ��ȯ�ϸ� " + tmp + "�Դϴ�.");
	}
}