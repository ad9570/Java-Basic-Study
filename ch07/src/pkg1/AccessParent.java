package pkg1;

public class AccessParent {	// 다른 패키지에 자손 클래스를 만들려면 public 클래스여야 한다.
	
	private String pri = "private";		// 같은 클래스
	String def = "(default)";			// 같은 패키지
	protected String pro = "protected";	// 같은 패키지 + 자손(다른 패키지)
	public String pub = "public";		// 접근 제한 없음
	
	public void printMembers1() {
		System.out.println(pri);
		System.out.println(def);
		System.out.println(pro);
		System.out.println(pub);
	}
	
}