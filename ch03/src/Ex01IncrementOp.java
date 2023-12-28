class Ex01IncrementOp {
    public static void main(String[] args) {
        int i = 5, j;

        j = i++;  	// 후위형
        System.out.println("j = i++; 실행 후, i = " + i + ", j = " + j);

        i = 5;  	// 결과를 비교하기 위해, 값 초기화

        j = ++i;   	// 전위형
        System.out.println("j = ++i; 실행 후, i = " + i + ", j = " + j);

        i = 5;   	// 결과를 비교하기 위해, 값 초기화

        j = i;
        i++;        // 후위형
        System.out.println("j = i; i++; 실행 후, i = " + i + ", j = " + j);

        i = 5;  	// 결과를 비교하기 위해, 값 초기화

        ++i;
        j = i;  	// 후위형
        System.out.println("++i; j = i; 실행 후, i = " + i + ", j = " + j);
    }
}