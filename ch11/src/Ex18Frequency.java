import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Ex18Frequency {
	public static void main(String[] args) {
		String[] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D"};

		HashMap<String, Integer> map = new HashMap<>();

		for (String key : data) {
			if (map.containsKey(key)) {
				int value = (int) map.get(key);
				map.put(key, value + 1);	// 기존에 존재하는 키면 기존 값을 1증가
			} else {
				map.put(key, 1);			// 기존에 존재하지 않는 키는 값을 1로 저장
			}
		}

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			int value = entry.getValue();
			System.out.println(entry.getKey() + " : " + value + " " + printBar('█', value));
		}
	}

	public static String printBar(char ch, int value) {
		char[] bar = new char[value];

//		for (int i = 0; i < bar.length; i++)
//			bar[i] = ch;
		Arrays.fill(bar, ch);

		return new String(bar); // String(char[] chArr)
	}
}
