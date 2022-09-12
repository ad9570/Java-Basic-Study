import java.util.*;

class Ex09DigitSum {
	public static void main(String[] args) { 
		int num = 0, sum = 0;
		
		for (num = 12345; num > 0; num /= 10) {
			System.out.print("num%10= "+ num % 10 +" ");
			System.out.println("num= " + num);
			sum += num % 10;
		}
		System.out.println("각 자리수의 합:"+sum);
		
		System.out.print("숫자를 입력하세요.>");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();  // 화면을 통해 입력받은 내용을 tmp에 저장
		num = Integer.parseInt(tmp);      // 입력받은 문자열(tmp)을 숫자로 변환
		sum = 0;

		while(num!=0) {    
			// num을 10으로 나눈 나머지를 sum에 더함, 10으로 나눈 나머지 = 마지막 자리
			sum += num%10; 	// sum = sum + num%10;
			System.out.printf("sum=%3d num=%d%n", sum, num);

			num /= 10;   // num = num / 10;  num을 10으로 나눈 값을 다시 num에 저장
		}

		scanner.close();
		System.out.println("각 자리수의 합:"+sum);
	}
}