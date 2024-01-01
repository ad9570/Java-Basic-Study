import java.io.*;

@SuppressWarnings("all")
class Ex10ThrowsTryCatch {
	public static void main(String[] args) {
		// file1 생성 : throws 예외가 발생하면 넘긴 후 -> try-catch 호출한 쪽에서 처리
		try {
			File f = createFile(args[0]);
			System.out.println(f.getName() + " 파일 생성 성공.");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " 파일 생성 실패.");
		}
		// file2 생성 : try-catch 예외가 발생한 곳에서 직접 처리
		System.out.println(createFile2(args[1]));
	}

	static File createFile(String fileName) throws Exception {
		if (fileName == null || fileName.isEmpty())
			throw new Exception("파일 이름이 유효하지 않습니다.");
		File f = new File(fileName);		//  File클래스의 객체를 만든다.
		// File객체의 createNewFile메서드를 이용해서 실제 파일을 생성한다.
		f.createNewFile();
		return f;		// 생성된 객체의 참조를 반환한다.
	}

	private static String createFile2(String fileName) {
		try {
			if (fileName == null || fileName.isEmpty())
				throw new Exception("파일 이름이 유효하지 않습니다.");
			File f = new File(fileName);
			f.createNewFile();
			return f.getName() + " 파일 생성 성공.";
		} catch (Exception e) {
			return e.getMessage() + " 파일 생성 실패.";
		}
	}
}