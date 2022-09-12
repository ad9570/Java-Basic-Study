class Ex12Continue {
	public static void main(String[] args) {
		for(int i=0;i <= 10;i++) {
			if (i%2==0)
				continue;
			System.out.println(i);	// continue문이 수행되면 이 부분은 실행되지 않고
		}							// 블럭의 끝으로 이동해 다음 반복을 실행한다
	}
}