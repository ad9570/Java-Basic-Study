@SuppressWarnings("all")
class Ex13ChainedException {
    public static void main(String[] args) {
        try {
            install();
        } catch (InstallException e) {
            System.out.println("설치 실패 : " + e.getMessage());
            e.printStackTrace();
        }
    }

    static void install() throws InstallException {
        try {
            startInstall();		// 프로그램 설치에 필요한 준비를 한다.
            copyFiles();        // 파일들을 복사한다.
            System.out.println("설치가 완료되었습니다.");
        } catch (SpaceException se) {
            InstallException ie = new InstallException("설치 중 예외 발생");
            ie.initCause(se);	// SpaceException을 InstallException의 원인 예외로 등록
            throw ie;
        }
        // MemoryException이 unchecked 예외가 되어 catch 블럭이 불필요해짐
//		catch (MemoryException me) {
//			InstallException ie = new InstallException("설치 중 예외 발생");
//			ie.initCause(me);
//			throw ie;
//		}
        finally {
            deleteTempFiles();        // 프로그램 설치에 사용된 임시파일들을 삭제한다.
        }
    }

    static void startInstall() throws SpaceException {
        if (!enoughSpace()) {	// 충분한 설치 공간이 없으면...
			throw new SpaceException("공간이 부족합니다.");
		}
        if (!enoughMemory()) {  // 충분한 메모리가 없으면...
			throw new RuntimeException(new MemoryException("메모리가 부족합니다."));
		}
        /* MemoryException을 RuntimeException의 원인 예외로 등록해
         * checked 예외에서 unchecked 예외로 바꿔줌 */
//			throw new MemoryException("메모리가 부족합니다.");
        System.out.println("설치를 시작합니다.");
    }

    static void copyFiles() {
        System.out.println("파일을 복사합니다.");
    }

    static void deleteTempFiles() {
        System.out.println("임시 파일을 삭제합니다.");
    }

    static boolean enoughSpace() {
        System.out.println("설치에 필요한 공간이 있는지 확인합니다.");
        return false;
    }

    static boolean enoughMemory() {
        System.out.println("설치에 필요한 메모리가 있는지 확인합니다.");
        return true;
    }
}

class InstallException extends Exception {
    InstallException(String msg) {
        super(msg);
    }
}