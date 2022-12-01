class Ex11CastError {
	public static void main(String[] args) {
		Car c = null;			// 형변환이 가능한지 여부보다 실제 인스턴스가 적절한지가 중요함
		FireEngine fe = null;	// 실제 인스턴스가 없는 null값 참조변수를 형변환 시 멤버 사용 불가능
		
		FireEngine fe2 = (FireEngine)c;
		Car c2 = fe;
//		c2.drive();		// ERROR, NullPointerException
//		fe2.water();	// ERROR, NullPointerException
		System.out.println(fe2);
		System.out.println(c2);
		
		Car c3 = new Car();	// water()가 없는 멤버 4개짜리 인스턴스
		
		FireEngine fe3 = (FireEngine)c3;	// water()를 포함한 멤버 5개짜리 클래스로 형변환 해도
											// 하지만 실제 인스턴스에 water()가 없어 호출 불가능
//		fe3.water();	// ERROR, ClassCastException
		System.out.println(fe3);
	}
}
