import java.util.*; 

class Ex05UserCalendar {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Usage : java Ex05UserCalendar 2023 1");
			return;
		} 
		int year  = Integer.parseInt(args[0]); 
		int month = Integer.parseInt(args[1]);
		// �޷��� ���� �� �ʿ��� ��
		int END_DAY = 0;			// 1. ����
		int START_DAY_OF_WEEK = 0;	// 2. ù���� ����

		Calendar sDay = Calendar.getInstance(); // ������ 
		Calendar eDay = Calendar.getInstance(); // ���� 

		// ���� ��� 0���� 11������ ���� �����Ƿ� 1�� ���־�� �Ѵ�.
		sDay.set(year, month - 1, 1);

		// 1. ���� ���ϱ�
		// �������� ù������ �Ϸ縦 ���� ������� ������ ���� �ȴ�.
		eDay.set(year, month, 1);
		eDay.add(Calendar.DATE, -1);
		END_DAY = eDay.get(Calendar.DATE);

		// 2. ù���� ���� ���ϱ�
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);

		// 3. �޷� ���
		StringBuilder sb = new StringBuilder();

		sb.append("      " + year + "�� " + month + "��\n");
		sb.append(" SU MO TU WE TH FR SA\n");

		// �ش� ���� 1���� ��� ���������� ���� ������ ����Ѵ�. 
		// ���� 1���� �������̶�� ������ �� �� ��´�.(�Ͽ��Ϻ��� ����) 
//		for (int i = 1; i < START_DAY_OF_WEEK; i++)
//			System.out.print("   ");
		sb.append("   ".repeat(START_DAY_OF_WEEK - 1));	// JDK 11 ~

		// �� ��(i)�� �ϳ��� ������Ŵ�� ���ÿ� ���� ��(n)�� �ϳ��� ������Ų��.
		// ���� ��(n)�� ù���� ���� ������ �ʱ�ȭ�Ѵ�.
		for (int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
			sb.append((i < 10) ? "  " + i : " " + i);
			if (n % 7 == 0) sb.append("\n");
		}

		System.out.println(sb);
	} 
}