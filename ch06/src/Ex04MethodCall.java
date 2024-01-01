class Ex04MethodCall {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L);    // ① add 메서드를 호출한다. ③작업을 마치면 호출한 곳으로 돌아온다.
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);
        long result5 = mm.max(5L, 3L);
        long result6 = mm.min(5L, 3L);

        mm.print9(12);
        mm.print9(7);
        mm.print9(0);

        System.out.println("add(5L, 3L) = " + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiply(5L, 3L) = " + result3);
        System.out.println("divide(5L, 3L) = " + result4);
        System.out.println("max(5L, 3L) = " + result5);
        System.out.println("min(5L, 3L) = " + result6);
    }
}

@SuppressWarnings("all")
class MyMath {
    long add(long a, long b) {    // ② 호출된 메서드가 작업을 한다.
        return a + b;
    }

    long subtract(long a, long b) {
        return a - b;
    }

    long multiply(long a, long b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }

    long max(long a, long b) {
        if (a > b) {
            return a;    // 조건식이 참일때만 실행
        } else {
            return b;    // 조건식이 거짓일때만 실행
        }
    }

    long min(long a, long b) {
        return a < b ? a : b;
    }

    void print9(int n) {
        if (!(2 <= n && n <= 9)) {
			return;
		}

        for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d%n", n, i, n * i);
		}

//		return;	// 반환타입이 void일 경우 생략가능
    }
}
