@SuppressWarnings("unused")
class Product2 {
    int price;       	// 제품의 가격
    int bonusPoint;  	// 제품구매 시 제공하는 보너스점수

    Product2(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }

    Product2() {
    }
}

class Tv2 extends Product2 {
    Tv2() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer2 extends Product2 {
    Computer2() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio2 extends Product2 {
    Audio2() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}

class Buyer2 {              // 고객, 물건을 사는 사람
    int money = 1500;      	// 소유금액
    int bonusPoint = 0; 	// 보너스점수
    Product2[] cart = new Product2[10];   // 구입한 제품을 저장하기 위한 배열, 장바구니 기능
    int i = 0;              // Product배열에 사용될 배열 인덱스 카운터

    void buy(Product2 p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        if (i >= 10) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        money -= p.price;             // 가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint;   // 제품의 보너스 점수를 추가한다.
        cart[i++] = p;                // 제품을 Product[] cart에 저장한다.
        // i를 1 증가시켜 다음 저장 시 배열의 다음칸에 저장한다.
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    void summary() {          							// 구매한 물품에 대한 정보를 요약해서 보여 준다.
        int sum = 0;        							// 구입한 물품의 가격합계
        StringBuilder itemList = new StringBuilder();	// 구입한 물품목록

        // 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) {
				break;
			}
            sum += cart[i].price;
			if (i == 0) {
				itemList.append(cart[i]);	// itemList.append(cart[i].toString()); 과 동일한 코드
			} else {
				itemList.append(", ").append(cart[i]);	// itemList.append(", ").append(cart[i].toString()); 과 동일한 코드
			}
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

class Ex13Cart {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();

        b.buy(new Tv2());
        b.buy(new Computer2());
        b.buy(new Audio2());
        b.buy(new Computer2());
        b.buy(new Tv2());
        b.buy(new Audio2());
        b.buy(new Audio2());
        b.buy(new Tv2());
        b.buy(new Computer2());
        b.buy(new Computer2());
        b.buy(new Tv2());
        b.summary();
    }
}