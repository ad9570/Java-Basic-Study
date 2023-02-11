import java.util.*;

class Ex01ArrayList {
    public static void main(String[] args) {
        // �⺻ ����(capacity)�� 10�� ArrayList�� ����
        ArrayList<Comparable> list1 = new ArrayList<>(10);
        list1.add(5);   // OK, ����ڽ� -> list1.add(new Integer(5));
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);

        List<Comparable> sublist = list1.subList(1, 4);
        print(list1, sublist);

        // subList�� ���� ����Ʈ�� ���� �� ��ȣ ����
        sublist.add(6);
        print(list1, sublist);

        // ���� ����Ʈ ���� �� subList ��� �Ұ���
        list1.remove(4);
        try {
            System.out.println("sublist = " + sublist + "\n");
        } catch (ConcurrentModificationException e) {
            System.out.println("ConcurrentModificationException �߻�\n");
        }

        // subList�� list1�� ��ȣ�ۿ� ���� �ʵ��� subList�� ������ ���� ���ο� ArrayList�� list2 ����
        ArrayList<Comparable> list2 = new ArrayList<>(list1.subList(1, 4));
        print(list1, list2);

        // Collections : �÷����� ���� �ٷ�� �޼ҵ带 ���� ��ƿ Ŭ����
        Collections.sort(list1);    // list1�� list2�� �����Ѵ�.
        Collections.sort(list2);    // Collections.sort(List l)
        print(list1, list2);

        System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2) + "\n");

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");
        print(list1, list2);

        list2.set(3, "AA");
        print(list1, list2);

        // list1���� list2�� ��ġ�� �κи� ����� �������� �����Ѵ�.
        System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2) + "\n");

        print(list1, list2);

        //  list2���� list1�� ���Ե� ��ü���� �����Ѵ�.
        for (int i = list2.size() - 1; i >= 0; i--) {
            if (list1.contains(list2.get(i)))
                list2.remove(i);
        }
        print(list1, list2);

        ArrayList<Comparable> list3 = new ArrayList<>(10);
        list3.add("1");
        list3.add(0);
        list3.add(1);
        ArrayList<Comparable> list4 = new ArrayList<>(list3);
        print(list3, list4);

        System.out.println("indexOf(\"1\") = " + list3.indexOf("1"));
        System.out.println("indexOf(1) = " + list3.indexOf(1) + "\n");  // OK, ����ڽ� -> list1.add(new Integer(1));

        list3.remove(1);                // �ε��� 1�� ����� ��ü�� ����
        list4.remove(Integer.valueOf(1));   // ���� 1�� Integer ��ü�� ����
        print(list3, list4);
    }

    static void print(List<Comparable> list1, List<Comparable> list2) {
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        System.out.println();
    }
}