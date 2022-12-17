class Ex07CheckedException {
	public static void main(String[] args) {
		try {
			throw new Exception("Exception 클래스와 그 자손들(RuntimeException 제외)");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " : 예외 처리 필수");
		}

//		throw new Exception();		// 컴파일 에러 발생, 실행 불가능
	}
}