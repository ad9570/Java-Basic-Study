import java.util.Random;

public class Seed {

	public static void main(String[] args) {
		Random rd1 = new Random(1);
		
		Random rd2 = new Random();
		rd2.setSeed(1);
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 20; i++) {
			sb.append("rd1 : " + rd1.nextInt(100) + ", rd2 : " + rd2.nextInt(100) + "\n");
		}
		
		System.out.println(sb);
	}

}
