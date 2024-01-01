// 하나의 소스파일엔 하나의 클래스만 사용하는 것이 바람직하다.
// 소스파일의 이름은 public class 이름과 일치해야 한다.
// 하나의 소스파일엔 하나의 public class만 허용된다.
// 클래스명과 소스파일명 불일치시 IDE가 main메서드를 자동으로 실행해주지 못한다.

// public class Hello2 {}
class hello3 {
	public static void main(String[] args) {
		System.out.println("hello");
	}
}
@SuppressWarnings("unused")
class Hello4 {}
@SuppressWarnings("unused")
class Hello5 {}