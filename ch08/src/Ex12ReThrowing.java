class Ex12ReThrowing {
	public static void main(String[] args) {
		try  {
			method();
		} catch (Exception e)	{
			System.out.println("main()���� ���ܰ� ó���Ǿ����ϴ�.");
		}
	}

	static void method() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method()���� ���ܰ� ó���Ǿ����ϴ�.");
			throw e;			// �ٽ� ���ܸ� �߻���Ų��.
		}
	}
}