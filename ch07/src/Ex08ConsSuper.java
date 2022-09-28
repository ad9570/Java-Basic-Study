public class Ex08ConsSuper {
	public static void main(String[] args) {
		Point3 p = new Point3(2, 3, 1);
		System.out.println(p.x + ", " + p.y + ", " + p.z);
	}
}

class Point2 {
	int x, y;
	
	Point2() {	// 아래와 같은 에러를 방지하기 위해 항상 기본 생성자를 작성해 주는 것이 좋음
		this(4, 7);
	}

	Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Point3 extends Point2 {
	int z;

	Point3(int x, int y, int z) {
		super(x, y); // Point2(int x, int y)를 호출
		this.z = z;
	}
	
	Point3(int z) {	// super(); 자동 추가 -> Point2의 기본 생성자 Point2()가 없을 경우 에러 발생
		x = 4;
		y = 7;
		this.z = z;
	}
}