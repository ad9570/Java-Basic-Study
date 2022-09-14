class Ex14ComplexInit {
	static int x = 1;
	int y = 1;
	
	static {
		System.out.println("static { }");
		x = 2;
	}

	{
		System.out.println("{ }");
		y = 2;
	}

	public Ex14ComplexInit() {
		System.out.println("생성자");
		y = 3;
	}

	public static void main(String args[]) {
		System.out.println("Ex14ComplexInit bt1 = new Ex14ComplexInit(); ");
		Ex14ComplexInit bt1 = new Ex14ComplexInit();
		System.out.println(bt1.y);

		System.out.println("Ex14ComplexInit bt2 = new Ex14ComplexInit(); ");
		Ex14ComplexInit bt2 = new Ex14ComplexInit();
		System.out.println(bt2.y);
	}
}