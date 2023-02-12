import java.util.*;

public class Ex03UseStack {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Usage:java Ex03UseStack \"EXPRESSION\"");
			System.out.println("Example:java Ex03UseStack \"((2+3)*1)+3\"");
			System.exit(0);
		}

		Stack<String> st = new Stack<>();
		String expression = args[0];

		System.out.println("expression:" + expression);

		try {
			for (int i = 0; i < expression.length(); i++) {
				char ch = expression.charAt(i);

				if (ch == '(') {
					st.push(ch + "");	// ���� ��ȣ�� ���ÿ� push
				} else if (ch == ')') {
					st.pop();				// �ݴ� ��ȣ�� ���ÿ��� pop
				}
			}

			if (st.isEmpty())
				System.out.println("��ȣ�� ��ġ�մϴ�.");
			else
				System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�. : ( �� �� ����");
		} catch (EmptyStackException e) {
			System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�. : ) �� �� ����");
		}
	}
}