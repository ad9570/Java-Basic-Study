package pkg2;

import pkg1.AccessParent;

class AccessChild extends AccessParent {

	public void printMembers2() {
//		System.out.println(pri);	// ERROR, 다른 클래스에서 접근 불가능
//		System.out.println(def);	// ERROR, 다른 패키지에서 접근 불가능
		System.out.println(pro);	// OK, 다른 패키지의 자손 클래스에서 접근 가능
		System.out.println(pub);
	}
	
	@Override
	public void printMembers1() {
		super.printMembers1();		// 하지만 private, (default) 멤버가 포함된 메서드도 오버라이딩은 가능
	}
	
}
