import java.util.StringJoiner;

class Ex09StringJoin {
	public static void main(String[] args) {
		String animals = "dog,cat,fish";
		String[] arr = animals.split(",");

		System.out.println(String.join("-", arr));	// 내부적으로 StringBuffer 사용

		StringJoiner sj = new StringJoiner("/","[","]");

		for(String s : arr) {
			sj.add(s);
		}

		System.out.println(sj);
	}
}