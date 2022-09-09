import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main15{

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		int cnt = 1;
		
		for (int i = 0; i < arr.length; i++)
			arr[i] = Integer.parseInt(br.readLine()) % 42;
		
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					break;
				}	
				if (j == i - 1) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}

}
