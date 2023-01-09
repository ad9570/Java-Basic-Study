import java.util.StringJoiner;

class Ex10PrimitiveToString {
	public static void main(String[] args) {
		int iVal = 100;
		String strVal = String.valueOf(iVal); // �⺻���� ���ڿ��� ��ȯ�Ѵ�.
		
		double dVal = 200.0;
		String strVal2 = dVal + "";	// �⺻���� ���ڿ��� ��ȯ�ϴ� �� �ٸ� ���

		double sum  = Integer.parseInt(strVal) + Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		System.out.println(String.join("", strVal, " + ", strVal2, " = ") + sum);

		StringJoiner sj = new StringJoiner("");
		System.out.println(sj.add(strVal).add(" + ").add(strVal2).add(" = ").add(sum + ""));

		Integer i = Integer.valueOf("+25");
		System.out.println("i = " + i);	// ���� �տ� +�� ���� ���ڿ��� ����� ��ȯ ok
	}
}