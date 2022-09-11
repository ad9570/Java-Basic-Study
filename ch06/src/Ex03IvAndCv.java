class Ex03IvAndCv {
	public static void main(String args[]) {
		System.out.println("-- 객체 생성 전 --");
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);

		System.out.println("-- 객체 생성 후 --");
		Card c1 = new Card();	// iv c1.kind, c1.number 생성
		c1.kind = "Heart";
		c1.number = 7;

		Card c2 = new Card();	// iv c2.kind, c2.number 생성
		c2.kind = "Spade";
		c2.number = 4;

		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
		
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
//		c1.width = 50;
//		c1.height = 80;
		Card.width = 50;
		Card.height = 80;

		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
	}
}

class Card {
	String kind;
	int number;
	static int width = 100;		// cv 생성
	static int height = 250;	// cv 생성
}