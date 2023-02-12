import java.util.*;

class Ex04UseQueue {
	static Queue<String> q = new LinkedList<>();
	static final int MAX_SIZE = 5;	// Queue�� �ִ� 5�������� ����ǵ��� �Ѵ�.

	public static void main(String[] args) {
		System.out.println("help�� �Է��ϸ� ������ �� �� �ֽ��ϴ�.");

		while(true) {
			System.out.print(">>");
			try {
				// ȭ�����κ��� ���δ����� �Է¹޴´�.
				Scanner s = new Scanner(System.in);  
				String input = s.nextLine().trim();	// ��/�� ���� ����

				if("".equals(input)) continue;

				if(input.equalsIgnoreCase("quit")) {
					System.exit(0);	// ���α׷� ����
				} else if(input.equalsIgnoreCase("help")) {
					System.out.println(" help - ������ �����ݴϴ�.");
					System.out.println(" quit - ���α׷��� �����մϴ�.");
					System.out.println(" history - �ֱٿ� �Է��� ��ɾ " + MAX_SIZE + "�� �����ݴϴ�.");
				} else if(input.equalsIgnoreCase("history")) {
					int i = 0;
					// LinkedList�� ������ �����ش�.
					LinkedList<String> list = (LinkedList<String>) q;

					for (String tmp : list) System.out.println(++i + "." + tmp);
				} else {
					save(input);    
					System.out.println(input);
				}
			} catch(Exception e) {
				System.out.println("�Է¿����Դϴ�.");
			}
		}
	}
	public static void save(String input) {
		// queue�� �����Ѵ�.
		if(!"".equals(input))	// if (input != null && !input.equals(""))
        	q.offer(input);
		/* null.equals("") -> NullPointerException
		 * "".equals(null) -> false */

		// queue�� �ִ�ũ�⸦ ������ ���� ó�� �Էµ� ���� �����Ѵ�.
		if(q.size() > MAX_SIZE)  // size()�� Collection�������̽��� ����
			q.poll();
	}
}