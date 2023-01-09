import java.util.StringJoiner;

class Ex10PrimitiveToString {
	public static void main(String[] args) {
		int iVal = 100;
		String strVal = String.valueOf(iVal); // 기본형을 문자열로 변환한다.
		
		double dVal = 200.0;
		String strVal2 = dVal + "";	// 기본형을 문자열로 변환하는 또 다른 방법

		double sum  = Integer.parseInt(strVal) + Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		System.out.println(String.join("", strVal, " + ", strVal2, " = ") + sum);

		StringJoiner sj = new StringJoiner("");
		System.out.println(sj.add(strVal).add(" + ").add(strVal2).add(" = ").add(sum + ""));

		Integer i = Integer.valueOf("+25");
		System.out.println("i = " + i);	// 숫자 앞에 +가 붙은 문자열도 양수로 변환 ok
	}
}