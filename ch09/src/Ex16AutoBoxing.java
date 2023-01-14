class Ex16AutoBoxing {
	public static void main(String[] args) {
		int i1 = 10;

		// �⺻���� ���������� ����ȯ(����ȯ ��������)
		Integer io = (Integer)i1; // Integer io = Integer.valueOf(i);
		Object o = (Object)i1;    // Object o = (Object)Integer.valueOf(i);

		Long lo = 100L;  // Long lo = new Long(100L);

		int i2 = io + 10;   // �������� �⺻������ ���� ����
		long l = io + lo;  // ������ ���� ������ ����

		Float fo = new Float(1.0f);
//		float f = (float)fo;  // �������� �⺻������ ����ȯ�� ����(����ȯ ��������)
		float f = fo;

		System.out.println("i1 = " + i1);
		System.out.println("io = " + io);
		System.out.println("o = " + o);
		System.out.println("lo = " + lo);
		System.out.println("io + 10 = " + i2);
		System.out.println("io + lo = " + l);
		System.out.println("fo = " + fo);
		System.out.println("f = " + f);
	}
}