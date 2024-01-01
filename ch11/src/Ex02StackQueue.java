import java.util.*;

class Ex02StackQueue {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        Queue<String> q = new LinkedList<>();    // Queue인터페이스의 구현체인 LinkedList를 사용

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

        System.out.println("== Stack ==");
        while (!st.empty()) {
            System.out.println(st.pop()); // 스택에서 요소 하나를 꺼내서 출력
        }

        System.out.println("== Queue ==");
        while (!q.isEmpty()) {
            System.out.println(q.poll()); // 큐에서 요소 하나를 꺼내서 출력
        }
    }
}