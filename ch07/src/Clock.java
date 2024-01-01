class Time {
    private int hour;    // 0 ~ 23

    // 클래스 외부에서 접근이 필요한 메서드 -> public 설정
    public void setHour(int hour) {
        if (isNotValidHour(hour)) {
            return;
        }
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    // 클래스 내부에서만 사용하는 메서드 -> private 설정
    private boolean isNotValidHour(int hour) {
        return hour < 0 || hour > 24;
    }
}

public class Clock {
    public static void main(String[] args) {
        Time t = new Time();
//		t.hour = 25;	// ERROR, 타 클래스에서 private 멤버 접근 불가능
//		System.out.println(t.hour);

        t.setHour(23);
        System.out.println(t.getHour());

        t.setHour(100);
        System.out.println(t.getHour());
    }
}
