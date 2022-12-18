import java.io.*;

class Ex10ThrowsTryCatch {
	public static void main(String[] args) {
		// file1 ���� : throws ���ܰ� �߻��ϸ� �ѱ� �� -> try-catch ȣ���� �ʿ��� ó��
		try {
			File f = createFile(args[0]);
			System.out.println(f.getName() + " ���� ���� ����.");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " ���� ���� ����.");
		}
		// file2 ���� : try-catch ���ܰ� �߻��� ������ ���� ó��
		System.out.println(createFile2(args[1]));
	}

	static File createFile(String fileName) throws Exception {
		if (fileName == null || fileName.equals(""))
			throw new Exception("���� �̸��� ��ȿ���� �ʽ��ϴ�.");
		File f = new File(fileName);		//  FileŬ������ ��ü�� �����.
     	// File��ü�� createNewFile�޼��带 �̿��ؼ� ���� ������ �����Ѵ�.
		f.createNewFile();
		return f;		// ������ ��ü�� ������ ��ȯ�Ѵ�.
	}

	private static String createFile2(String fileName) {
		try {
			if (fileName == null || fileName.equals(""))
				throw new Exception("���� �̸��� ��ȿ���� �ʽ��ϴ�.");
			File f = new File(fileName);
			f.createNewFile();
			return f.getName() + " ���� ���� ����.";
		} catch (Exception e) {
			return e.getMessage() + " ���� ���� ����.";
		}
	}
}