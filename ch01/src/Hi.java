import java.io.IOException;

public class Hi {
	
	public static void main(String[] args) throws IOException {
		long beforeTime = System.currentTimeMillis();	// 시작시간 측정(밀리초)
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10_000_000; i++) {
			sb.append(i);
			sb.append("\n");
		}
		
		System.out.println(sb);
		
		long afterTime = System.currentTimeMillis();	// 종료시간 측정(밀리초)
		
		System.out.println("\nSystem.out.println() : " + (afterTime - beforeTime));	// 소요시간 계산
	}
	
}

