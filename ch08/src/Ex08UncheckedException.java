class Ex08UncheckedException {
	public static void main(String[] args) {
		try {
			throw new RuntimeException("RuntimeException 클래스와 그 자손들");
		} catch (RuntimeException e) {
			System.out.println(e.getMessage() + " : 예외 처리 선택");
		}
		
		throw new RuntimeException();	// 컴파일 및 실행 가능, 런타임 에러 발생으로 프로그램 비정상 종료
	}
}