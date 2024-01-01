@SuppressWarnings("all")
class Ex17ImAndCm {
    class InstanceInner {
        String s = "II";
    }

    static class StaticInner {
        String s = "SI";
    }

    // 인스턴스 멤버 간에는 서로 직접 접근이 가능하다.
    InstanceInner iv1 = new InstanceInner();
    // static 멤버 간에는 서로 직접 접근이 가능하다.
    static StaticInner cv1 = new StaticInner();

    // 인스턴스 멤버는 static 멤버 접근 가능
    StaticInner iv2 = new StaticInner();
    // static 멤버는 인스턴스 멤버 접근 불가능
//	static InstanceInner cv2 = new InstanceInner();


    static void staticMethod() {
        // static멤버는 인스턴스멤버에 직접 접근할 수 없다.
//		InstanceInner obj1 = new InstanceInner();	
        StaticInner obj2 = new StaticInner();
        System.out.println(obj2.s);

        // 굳이 접근하려면 아래와 같이 객체를 생성해야 한다.
        // 인스턴스클래스는 외부 클래스를 먼저 생성해야만 생성할 수 있다.
        Ex17ImAndCm outer = new Ex17ImAndCm();
        InstanceInner obj1 = outer.new InstanceInner();
        System.out.println(obj1.s);
    }

    void instanceMethod() {
        // 인스턴스메서드에서는 인스턴스멤버와 static멤버 모두 접근 가능하다.
        InstanceInner obj1 = new InstanceInner();
        System.out.println(obj1.s);
        StaticInner obj2 = new StaticInner();
        System.out.println(obj2.s);
        // 메서드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근할 수 없다.
//		LocalInner lv = new LocalInner();
    }

    void myMethod() {
        class LocalInner {
            String s = "LI";
        }
        LocalInner lv = new LocalInner();
        System.out.println(lv.s);
    }

    public static void main(String[] args) {
        Ex17ImAndCm.staticMethod();

        Ex17ImAndCm ic = new Ex17ImAndCm();
        ic.instanceMethod();

        ic.myMethod();
    }
}