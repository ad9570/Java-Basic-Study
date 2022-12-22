class Ex11UserDefinedException {
	public static void main(String args[]) {
		try {
			startInstall();		// ���α׷� ��ġ�� �ʿ��� �غ� �Ѵ�.
			copyFiles();		// ���ϵ��� �����Ѵ�.
			System.out.println("��ġ�� �Ϸ�Ǿ����ϴ�.");
		} catch (SpaceException e)	{
			System.out.println("���� �޽��� : " + e.getMessage());
			e.printStackTrace();
			System.out.println("������ Ȯ���� �Ŀ� �ٽ� ��ġ�Ͻñ� �ٶ��ϴ�.");
		} catch (MemoryException me)	{
			System.out.println("���� �޽��� : " + me.getMessage());
			me.printStackTrace();
			System.out.println("�޸𸮸� Ȯ���� �Ŀ� �ٽ� ��ġ�Ͻñ� �ٶ��ϴ�.");
		} finally {
			deleteTempFiles();		// ���α׷� ��ġ�� ���� �ӽ����ϵ��� �����Ѵ�.
		}
	}

   static void startInstall() throws SpaceException, MemoryException { 
		if(!enoughSpace()) 		// ����� ��ġ ������ ������...
			throw new SpaceException("������ �����մϴ�.");
		if (!enoughMemory())		// ����� �޸𸮰� ������...
			throw new MemoryException("�޸𸮰� �����մϴ�.");
	   System.out.println("��ġ�� �����մϴ�.");
   }

   static void copyFiles() {
	   System.out.println("������ �����մϴ�.");
   }
   static void deleteTempFiles() {
	   System.out.println("�ӽ� ������ �����մϴ�.");
   }
   
   static boolean enoughSpace()   {
	   System.out.println("��ġ�� �ʿ��� ������ �ִ��� Ȯ���մϴ�.");
		return false;
   }
   
	static boolean enoughMemory() {
		System.out.println("��ġ�� �ʿ��� �޸𸮰� �ִ��� Ȯ���մϴ�.");
		return false;
   }
}

class SpaceException extends Exception {
	SpaceException(String msg) {
	   super(msg);	
   }
}

class MemoryException extends Exception {
	MemoryException(String msg) {
	   super(msg);	
   }
}