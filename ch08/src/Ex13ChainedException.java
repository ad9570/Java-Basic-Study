class Ex13ChainedException {
	public static void main(String args[]) {
		try {
			install();
		} catch(InstallException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();		
		}
	}

	static void install() throws InstallException {
		try {
			startInstall();		// ���α׷� ��ġ�� �ʿ��� �غ� �Ѵ�.
			copyFiles();		// ���ϵ��� �����Ѵ�.
			System.out.println("��ġ�� �Ϸ�Ǿ����ϴ�.");
		} catch (SpaceException se)	{
			InstallException ie = new InstallException("��ġ �� ���� �߻�");
			ie.initCause(se);	// SpaceException�� InstallException�� ���� ���ܷ� ���
			throw ie;
		}
		// MemoryException�� unchecked ���ܰ� �Ǿ� catch ���� ���ʿ�����
//		catch (MemoryException me) {
//			InstallException ie = new InstallException("��ġ �� ���� �߻�");
//			ie.initCause(me);
//			throw ie;
//		}
		finally {
			deleteTempFiles();		// ���α׷� ��ġ�� ���� �ӽ����ϵ��� �����Ѵ�.
		}
	}

	static void startInstall() throws SpaceException {
		if(!enoughSpace()) 		// ����� ��ġ ������ ������...
			throw new SpaceException("������ �����մϴ�.");
		if (!enoughMemory())	// ����� �޸𸮰� ������...
			throw new RuntimeException(new MemoryException("�޸𸮰� �����մϴ�."));
			/* MemoryException�� RuntimeException�� ���� ���ܷ� �����
			 * checked ���ܿ��� unchecked ���ܷ� �ٲ��� */
//			throw new MemoryException("�޸𸮰� �����մϴ�.");
		System.out.println("��ġ�� �����մϴ�.");
	}

   static void copyFiles() {
	   System.out.println("������ �����մϴ�.");
   }
   static void deleteTempFiles() {
	   System.out.println("�ӽ� ������ �����մϴ�.");
   }
   
   static boolean enoughSpace() {
	   System.out.println("��ġ�� �ʿ��� ������ �ִ��� Ȯ���մϴ�.");
	   return false;
   }
   static boolean enoughMemory() {
	   System.out.println("��ġ�� �ʿ��� �޸𸮰� �ִ��� Ȯ���մϴ�.");
	   return true;
   }
}

class InstallException extends Exception {
	InstallException(String msg) {
	   super(msg);	
   }
}