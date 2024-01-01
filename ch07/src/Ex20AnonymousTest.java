@SuppressWarnings("unused")
class Ex20AnonymousTest {
    Object iv = new Object() {    // 익명 클래스
        // 클래스 구현부
    };
    static Object cv = new Object() {    // 익명 클래스
        // 클래스 구현부
    };

    void myMethod() {
        Object lv = new Object() {    // 익명 클래스
            // 클래스 구현부
        };
    }
}