import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Hey {
	
	public static void main(String[] args) throws IOException {
		long beforeTime = System.currentTimeMillis();	// 시작시간 측정(밀리초)
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10_000_000; i++) {
			sb.append(i);
			sb.append("\n");
		}
		
		bw.append(sb);
		bw.flush();
		
		long afterTime = System.currentTimeMillis();	// 종료시간 측정(밀리초)
		
		bw.write("\nBufferedWriter : " + (afterTime - beforeTime));	// 소요시간 계산
		bw.flush();
		bw.close();
	}
	
}

