class Card {
	String kind;
	String number;

	Card() {
		this("SPADE", "A");
	}

	Card(String kind, String number) {
		this.kind = kind;
		this.number = number;
	}
}

class Ex04ToStringHash {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card("CLOVER", "4");

		Card c3 = new Card("SPADE", "A");
		System.out.println(c1.equals(c3));
		System.out.println(c1.hashCode());
		System.out.println(c3.hashCode());

		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}