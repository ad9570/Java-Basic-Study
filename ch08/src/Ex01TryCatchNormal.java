class Ex01TryCatchNormal {
	public static void main(String args[]) {
			System.out.println(1);			
			try {
				System.out.println(2);
				System.out.println(3);
				// ���� �߻� X
			} catch (Exception e)    {
				System.out.println(4);  // ������� �ʴ´�.
			} // try-catch�� ��
			System.out.println(5);
	}
}