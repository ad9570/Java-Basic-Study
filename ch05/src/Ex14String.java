
public class Ex14String {

	public static void main(String[] args) {
//					  12345
		String str = "ABCDE";
		char ch = str.charAt(2);
		System.out.println(ch);
		
		String str2 = str.substring(1, 4);	// 인덱스 1부터 4-1=3까지
		System.out.println(str2);
		
		String str3 = str.substring(1);					// 인덱스 1부터 끝까지
		String str4 = str.substring(1, str.length());	// 인덱스 1부터 끝까지
		System.out.println(str3 + ", " + str4);
		
		
	}

}
