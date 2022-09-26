class CenterPoint {
	int x;
	int y;
}

class CircleI extends CenterPoint {
	int r;
}

public class Ex02Inheritance {

	public static void main(String[] args) {
		CircleI c = new CircleI();
		c.x = 2;
		c.y = 1;
		c.r = 3;
		
		System.out.println("c.x = " + c.x);
		System.out.println("c.y = " + c.y);
		System.out.println("c.r = " + c.r);
	}

}
