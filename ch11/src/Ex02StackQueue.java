import java.util.*;

class Ex02StackQueue {
	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
		Queue<String> q = new LinkedList<>();	// Queue�������̽��� ����ü�� LinkedList�� ���
		
		st.push("1");
		st.push("2");
		st.push("3");
		st.push("4");
		st.push("5");

		q.offer("1");
		q.offer("2");
		q.offer("3");
		q.offer("4");
		q.offer("5");

		System.out.println("= Stack =");
		while(!st.empty()) {
			System.out.println(st.pop()); // ���ÿ��� ��� �ϳ��� ������ ���
		}

		System.out.println("= Queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll()); // ť���� ��� �ϳ��� ������ ���
		}
	}
}