class Ex14ComplexInit {
	static int x;
	int y;
	
	static {
		System.out.println("static { }");
		x = 2;
	}

	{
		System.out.println("{ }");
		y = 2;
	}

	public Ex14ComplexInit() {
	}

	public Ex14ComplexInit(int y) {
		System.out.println("생성자");
		this.y = y;
	}

	public static void main(String[] args) {
		System.out.println("x = " + x);

		System.out.println("Ex14ComplexInit bt1 = new Ex14ComplexInit(); ");
		Ex14ComplexInit bt1 = new Ex14ComplexInit(3);
		System.out.println("bt1.y = " + bt1.y);

		System.out.println("Ex14ComplexInit bt2 = new Ex14ComplexInit(); ");
		Ex14ComplexInit bt2 = new Ex14ComplexInit();
		System.out.println("bt2.y = " + bt2.y);
	}
}