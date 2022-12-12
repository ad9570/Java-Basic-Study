import java.util.Scanner; //1. import문

public class Ex06ScanfSample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //2. Scanner 객체 생성
		
//		int num1 = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		System.out.println(num1);
//		System.out.println(num2);
		
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		System.out.println(num);
	}

}
