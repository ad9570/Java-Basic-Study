class Point2D {
    int x;
    int y;

    Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return x + ", " + y;
    }

    public String toString() {    // Object클래스의 public String toString()을 오버라이딩
        return x + ", " + y;
    }
}

class Point3D extends Point2D {
    int z;

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    String getLocation() {    // 부모의 String getLocation()을 오버라이딩
        return x + ", " + y + ", " + z;
    }
}

@SuppressWarnings("all")
public class Ex05Override {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(3, 4, 11);
		System.out.println(p3.toString());
		System.out.println(p3);
        System.out.println(p3.getLocation());

		System.out.println();

        Point2D p2 = new Point2D(8, 7);
        System.out.println(p2.toString());
        System.out.println(p2);
        System.out.println(p2.getLocation());
    }
}
