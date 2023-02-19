class Ex11UserDefinedException {
	public static void main(String args[]) {
		try {
			startInstall();		// 프로그램 설치에 필요한 준비를 한다.
			copyFiles();		// 파일들을 복사한다.
			System.out.println("설치가 완료되었습니다.");
		} catch (SpaceException e)	{
			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
			System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
		} catch (MemoryException me)	{
			System.out.println("에러 메시지 : " + me.getMessage());
			me.printStackTrace();
			System.out.println("메모리를 확보한 후에 다시 설치하시기 바랍니다.");
		} finally {
			deleteTempFiles();		// 프로그램 설치에 사용된 임시파일들을 삭제한다.
		}
	}

	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace()) 		// 충분한 설치 공간이 없으면...
			throw new SpaceException("공간이 부족합니다.");
		if (!enoughMemory())		// 충분한 메모리가 없으면...
			throw new MemoryException("메모리가 부족합니다.");
		System.out.println("설치를 시작합니다.");
	}

	static void copyFiles() {
		System.out.println("파일을 복사합니다.");
	}
	static void deleteTempFiles() {
		System.out.println("임시 파일을 삭제합니다.");
	}

	static boolean enoughSpace()   {
		System.out.println("설치에 필요한 공간이 있는지 확인합니다.");
		return false;
	}

	static boolean enoughMemory() {
		System.out.println("설치에 필요한 메모리가 있는지 확인합니다.");
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