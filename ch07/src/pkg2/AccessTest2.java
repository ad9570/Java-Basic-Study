package pkg2;

import pkg1.AccessParent;

public class AccessTest2 {

	public static void main(String[] args) {
		AccessParent p = new AccessParent();
//		System.out.println(p.pri);	// ERROR, 다른 클래스에서 접근 불가능
//		System.out.println(p.def);	// ERROR, 다른 패키지에서 접근 불가능
//		System.out.println(p.pro);	// ERROR, 다른 패키지의 자손이 아닌 클래스에서 접근 불가능
		System.out.println(p.pub);
		
		System.out.println();
		AccessChild c = new AccessChild();
		c.printMembers1();
	}

}
