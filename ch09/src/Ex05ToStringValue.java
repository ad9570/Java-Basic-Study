import java.util.Objects;

class Card2 {
    String kind;
    String number;

    Card2() {
        this("DIAMOND", "7");  // Card(String kind, int number)를 호출
    }

    Card2(String kind, String number) {
        this.kind = kind;
        this.number = number;
    }

    // Object 클래스의 toString()을 오버라이딩
    public String toString() {
        return "kind : " + kind + ", number : " + number;
    }

    // Object 클래스의 equals()를 오버라이딩
    public boolean equals(Object obj) {
        if (!(obj instanceof Card2)) {
			return false;
		}
        Card2 c = (Card2) obj;
        return this.kind.equals(c.kind) && this.number.equals(c.number);
    }

    // equals()를 오버라이딩 하면 hashCode()도 오버라이딩 해야 함
    // Objects : 객체 관련 메서드를 제공하는 유틸 클래스
    // Objects.hash() : 매개변수가 가변인자(Object...) -> 여기에 비교하고싶은 iv를 갯수 상관 없이 모두 넣으면 됨
    public int hashCode() {
        return Objects.hash(kind, number);
    }
}

class Ex05ToStringValue {
    public static void main(String[] args) {
        Card2 c1 = new Card2();
        Card2 c2 = new Card2("HEART", "Q");

        Card2 c3 = new Card2("DIAMOND", "7");
        System.out.println(c1.equals(c3));
        System.out.println(c1.hashCode());
        System.out.println(c3.hashCode());

        System.out.println(c1);	// c1.toString()
        System.out.println(c2);	// c2.toString()
    }
}