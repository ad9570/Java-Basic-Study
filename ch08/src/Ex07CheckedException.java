class Ex07CheckedException {
	public static void main(String[] args) {
		try {
			throw new Exception("Exception Ŭ������ �� �ڼյ�(RuntimeException ����)");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " : ���� ó�� �ʼ�");
		}

//		throw new Exception();		// ������ ���� �߻�, ���� �Ұ���
	}
}