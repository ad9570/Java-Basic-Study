@SuppressWarnings("all")
class CircleO1 extends Object {
    CenterPoint p = new CenterPoint();
    int r;
}

@SuppressWarnings("unused")
class CircleO2 {
    CenterPoint p = new CenterPoint();
    int r;
}

@SuppressWarnings("all")
public class Ex04Object {
    public static void main(String[] args) {
        CircleO1 c1 = new CircleO1();
        System.out.println(c1.toString()); 	// 클래스명@클래스주소 관련 값
        System.out.println(c1);    			// println()은 참조변수를 매개변수로 받으면 자동으로 toString() 호출

        CircleO2 c2 = new CircleO2();
        System.out.println(c2.toString()); 	// 클래스명@클래스주소 관련 값
        System.out.println(c2);
    }
}