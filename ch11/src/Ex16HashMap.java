import java.util.*;

class Ex16HashMap {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("asdf", "1234");
		map.put("qwer", "1234");
		System.out.println(map);
		map.put("qwer", "1111");	// 중복된 key를 입력할 경우 기존의 value를 덮어씀
		System.out.println(map);

		Scanner s = new Scanner(System.in);	// 화면으로부터 라인단위로 입력받는다.

		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id : ");
			String id = s.nextLine().trim();	// 앞/뒤 공백 허용

			System.out.print("password : ");
			String password = s.nextLine().trim();	// 앞/뒤 공백 허용
			System.out.println();

			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			}

			if(!(map.get(id)).equals(password)) {
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
			} else {
				System.out.println("id와 비밀번호가 일치합니다.");
				break;
			}
		}
	}
}
