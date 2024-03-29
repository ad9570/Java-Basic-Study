class Ex10Overloading {
    public static void main(String[] args) {
        MyMath3 mm = new MyMath3();
//		System.out.println("mm.add(3, 3) 결과:"    + mm.add(3,3));
        // The method add(int, long) is ambiguous for the type MyMath3
        // add(3, 3)이 add(long, int)를 호출하는건지 add(int, long)을 호출하는건지 알 수 없음
        System.out.println("mm.add(3L, 3) 결과: " + mm.add(3L, 3));
        System.out.println("mm.add(3, 3L) 결과: " + mm.add(3, 3L));
        System.out.println("mm.add(3L, 3L) 결과: " + mm.add(3L, 3L));
        // 안의 메서드(add)가 먼저 실행 -> 그 반환값을 이용해 바깥 메서드(println)가 실행

        int[] a = {100, 200, 300};
        System.out.println("mm.add(a) 결과: " + mm.add(a));
    }
}

@SuppressWarnings("all")
class MyMath3 {
//	int add(int a, int b) {
//		System.out.print("int add(int a, int b) - ");
//		return a + b;
//	}

    long add(int a, long b) {
        System.out.print("long add(int a, long b) - ");
        return a + b;
    }

    long add(long a, int b) {
        System.out.print("long add(long a, int b) - ");
        return a + b;
    }

    long add(long a, long b) {
        System.out.print("long add(long a, long b) - ");
        return a + b;
    }

    int add(int[] a) {        // 배열의 모든 요소의 합을 결과로 돌려준다.
        System.out.print("int add(int[] a) - ");
        int result = 0;
        for (int elm : a) {
            result += elm;
        }

        return result;
    }
}