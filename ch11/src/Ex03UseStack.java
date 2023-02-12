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
					st.push(ch + "");	// 여는 괄호는 스택에 push
				} else if (ch == ')') {
					st.pop();				// 닫는 괄호는 스택에서 pop
				}
			}

			if (st.isEmpty())
				System.out.println("괄호가 일치합니다.");
			else
				System.out.println("괄호가 일치하지 않습니다. : ( 가 더 많음");
		} catch (EmptyStackException e) {
			System.out.println("괄호가 일치하지 않습니다. : ) 가 더 많음");
		}
	}
}