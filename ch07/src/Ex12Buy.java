class Product {
	int price;			// 제품의 가격
	int bonusPoint;	// 제품구매 시 제공하는 보너스점수

	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);	// 보너스점수는 제품가격의 10%
	}
}

class Tv1 extends Product {
	Tv1() {
		// 조상클래스의 생성자 Product(int price)를 호출한다.
		super(100);		// Tv의 가격을 100만원, 보너스점수를 10으로 한다.
	}

	// Object클래스의 toString()을 오버라이딩한다.
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}

class Buyer {	// 고객, 물건을 사는 사람
	int money = 1000;	  // 소유금액
	int bonusPoint = 0; // 보너스점수

	// 제품 갯수만큼의 오버로딩 메서드
//	void buy(Tv1 t) {};
//	void buy(Computer c) {};
//	void buy(Audio a) {};
	
	// 매개변수의 다형성을 이용한 하나의 메서드로 모든 제품 공동 사용 가능
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}

		money -= p.price;            // 가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint;  // 제품의 보너스 점수를 추가한다.
		

//		System.out.println(p.toString() + "을/를 구입하셨습니다.");	// 아래와 동일한 코드
		System.out.println(p + "을/를 구입하셨습니다.");
	}
}

class Ex12Buy {
	public static void main(String args[]) {
		Buyer b = new Buyer();

		Product p1 = new Tv1();
		Product p2 = new Computer();
		Product p3 = new Audio();
		b.buy(p1);
		b.buy(p2);
		b.buy(p3);					// 아래와 동일한 코드
		
		b.buy(new Tv1());
		b.buy(new Computer());
		b.buy(new Audio());			// 참조변수가 없어 생성한 인스턴스를 이 밖에서 사용 불가능

		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
	}
}