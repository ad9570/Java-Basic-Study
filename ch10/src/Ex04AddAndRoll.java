import java.util.*;

class Ex04AddAndRoll {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(2022, 7, 31);	// 2022�� 8�� 31��

		// add(�ʵ�, ��)�� �ٸ� �ʵ忡 ������ �ָ� ����/����
		System.out.println(toString(date));
		System.out.println("== add : 1�� �� ==");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));

		System.out.println("== add : 9�� �� ==");
		date.add(Calendar.MONTH, -9);
		System.out.println(toString(date));

		// roll(�ʵ�, ��)�� �ٸ� �ʵ忡 ������ ���� ������(�� ���� �ʰ��� ����) ����/����
		System.out.println("== roll : 7�� �� ==");
		date.roll(Calendar.DATE, -7);
		System.out.println(toString(date));

		System.out.println("== roll : 3�� �� ==");
		date.roll(Calendar.MONTH, 3);
		System.out.println(toString(date));
	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "�� " + (date.get(Calendar.MONTH) + 1) + "�� "
				+ date.get(Calendar.DATE) + "��";
	}
}