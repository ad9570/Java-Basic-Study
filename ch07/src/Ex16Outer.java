@SuppressWarnings("all")
class Ex16Outer {
    int outerIv = 0;

    class InstanceInner {
        int iv = 100;
        //		static int cv = 100;            // 에러! static변수를 선언할 수 없다.
        final static int CONST = 100;   // final static은 상수이므로 허용

        void method() {
            outerIv = iv;
        }
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 200;    // static클래스만 static멤버를 정의할 수 있다.

        void method() {
//			outerIv = cv;		// 에러! static 내부클래스는 외부클래스의 인스턴스 멤버를 사용할수 없다.
        }
    }

    void myMethod() {
        class LocalInner {
            int iv = 300;
            //			static int cv = 300;             // 에러! static변수를 선언할 수 없다.
            final static int CONST = 300;    // final static은 상수이므로 허용

            void method() {
                outerIv = iv;
            }
        }

        int i = LocalInner.CONST;
        System.out.println(i);

        LocalInner li = new LocalInner();
        li.method();
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
//		System.out.println(LocalInner.CONST);	// 에러! 해당 메서드 밖에서 지역 내부클래스 사용 불가능

        Ex16Outer o = new Ex16Outer();
        o.myMethod();
    }
}