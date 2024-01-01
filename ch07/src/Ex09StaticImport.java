import static java.lang.System.out;	// System 클래스의 클래스 변수 out
import static java.lang.Math.*;	// Math 클래스의 모든 멤버

class Ex09StaticImport {
	public static void main(String[] args) {	
		// System.out.println(Math.random());
		out.println(random());	// random() : Math 클래스의 클래스 메서드

		// System.out.println("Math.PI : " + Math.PI);
		out.println("Math.PI : " + PI);	// PI : Math 클래스의 클래스 상수
	}
}