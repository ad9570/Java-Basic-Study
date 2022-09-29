package pkg1;

public class AccessTest1 {

	public static void main(String[] args) {
		AccessParent p = new AccessParent();
//		System.out.println(p.pri);	// ERROR, 다른 클래스에서 접근 불가능
		System.out.println(p.def);
		System.out.println(p.pro);
		System.out.println(p.pub);
	}

}
