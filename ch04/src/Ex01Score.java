import java.util.Scanner;

class Ex01Score {
    public static void main(String[] args) {
        int score;        	// 점수를 저장하기 위한 변수
//		char grade = ' ';  	// 학점을 저장하기 위한 변수. 공백으로 초기화한다.
        char grade = 'D';	// 공백 대신 else문에 해당하는 학점인 'D'로 초기화한다.

        System.out.print("점수를 입력하세요.>");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();	// 화면을 통해 입력받은 숫자를 score에 저장

        if (score >= 90) {         	// score가 90점 보다 같거나 크면 A학점
            grade = 'A';
        } else if (score >= 80) {   // score가 (90점 보다 작고) 80점 보다 같거나 크면 B학점
            grade = 'B';
        } else if (score >= 70) {   // score가 (80점 보다 작고) 70점 보다 같거나 크면 C학점
            grade = 'C';
        }
//		else {                   	// 나머지는 D학점
//			 grade = 'D'; 		 	// 학점의 초기값을 D학점으로 준다면 else문을 생략 가능하다.
//		}
        System.out.println("당신의 학점은 " + grade + "입니다.");
    }
}