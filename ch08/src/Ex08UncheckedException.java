class Ex08UncheckedException {
	public static void main(String[] args) {
		try {
			throw new RuntimeException("RuntimeException Ŭ������ �� �ڼյ�");
		} catch (RuntimeException e) {
			System.out.println(e.getMessage() + " : ���� ó�� ����");
		}
		
		throw new RuntimeException();	// ������ �� ���� ����, ��Ÿ�� ���� �߻����� ���α׷� ������ ����
	}
}