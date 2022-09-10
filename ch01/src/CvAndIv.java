
public class CvAndIv {

	// 변수
	static int x = 5;
	static int y = 4;
	int z = 10;
	
	// 메서드
	public static int plus(int a, int b) {
		return a + b;
	}
	public int minus(int a, int b) {
		return a - b;
	}
	
	// main
	public static void main(String[] args) {
		System.out.println("클래스변수(cv) x : " + x);
//		System.out.println("인스턴스변수(iv) z : " + z);
		
		System.out.println("클래스메서드 plus : " + plus(x, y));
//		System.out.println("인스턴스메서드 minus : " + minus(x, y));
		
		System.out.println("== 인스턴스 생성 ==");
		CvAndIv i = new CvAndIv();
		
		System.out.println("인스턴스변수(iv) z : " + i.z);
		
		System.out.println("인스턴스메서드 minus : " + i.minus(i.z, y));
	}

}
