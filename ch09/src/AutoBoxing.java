import java.util.ArrayList;

@SuppressWarnings("all")
public class AutoBoxing {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(new Integer(10));      // List에는 객체만 저장 가능
        list.add(20);                       // JDK 1.5 이전에는 에러, JDK 1.5 이후 컴파일러가 자동 변환
//      list.add(new Integer(20));          // JDK 9 이후 deprecated

        System.out.println("list = " + list);

        Integer i1 = list.get(0);           // List에 저장된 첫번째 객체를 꺼낸다.
        int i2 = list.get(1);               // JDK 1.5 이전에는 에러, JDK 1.5 이후 컴파일러가 자동 변환
        int i3 = list.get(1).intValue();    // 수동 변환 방법

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }
}