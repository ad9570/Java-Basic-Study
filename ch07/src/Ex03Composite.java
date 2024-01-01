class CircleC {
    CenterPoint p = new CenterPoint();
    int r;
}

public class Ex03Composite {
    public static void main(String[] args) {
        CircleC c = new CircleC();
        c.p.x = 4;
        c.p.y = 7;
        c.r = 5;

        System.out.println("c.p.x = " + c.p.x);
        System.out.println("c.p.y = " + c.p.y);
        System.out.println("c.r = " + c.r);
    }
}