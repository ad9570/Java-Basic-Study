class Ex09Throws {
	public static void main(String[] args) throws Exception {
		method1();	// ���� Ŭ���� ���� static ����̹Ƿ� ��ü ���� ���� ���� ȣ�� ����.
					// �޼��尡 ���������� ���� ó������ �ʾ�, ���α׷� ������ ����
  	}

	static void method1() throws Exception {
		method2();	// method1() ������ ���� �� ����� ���ܸ� main()�� �ѱ�
	}

	static void method2() throws Exception {
		throw new Exception();	// method2() ������ ���� �� ����� ���ܸ� method1()�� �ѱ�
	}
}