@SuppressWarnings("all")
class Ex03HashCode {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode() == str2.hashCode());
        System.out.println(System.identityHashCode(str1) == System.identityHashCode(str2));
    }
}