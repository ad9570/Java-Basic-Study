class Ex05CallStack {                        	// 빈 스택
    public static void main(String[] args) {	// main(실행)이 스택에 들어옴 - main
        System.out.println("Hello");        	// println(실행)이 스택에 들어와 main(대기)위에 쌓임 - println/main
    }                                        	// println이 종료되어 스택에서 나가고 main(실행)만 남음 - main
}                                            	// main이 종료되어 빈 스택