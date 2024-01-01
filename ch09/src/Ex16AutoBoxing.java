@SuppressWarnings("all")
class Ex16AutoBoxing {
    public static void main(String[] args) {
        int i1 = 10;

        // 기본형을 참조형으로 형변환(형변환 생략가능)
        Integer io = i1;	// <- Integer io = (Integer) i1; <- Integer io = Integer.valueOf(i);
        Object o = i1;    	// <- Object o = (Object) i1; <- Object o = (Object) Integer.valueOf(i);

        Long lo = 100L;  	// Long lo = new Long(100L);

        int i2 = io + 10;   // 참조형과 기본형간의 연산 가능
        long l = io + lo;  	// 참조형 간의 덧셈도 가능

        Float fo = 1.6f;	// Float fo = new Float(1.0f);
//		float f = (float) fo;  // 참조형을 기본형으로 형변환도 가능(형변환 생략가능)
        float f = fo;

        System.out.println("i1 = " + i1);
        System.out.println("io = " + io);
        System.out.println("o = " + o);
        System.out.println("lo = " + lo);
        System.out.println("io + 10 = " + i2);
        System.out.println("io + lo = " + l);
        System.out.println("fo = " + fo);
        System.out.println("f = " + f);
    }
}