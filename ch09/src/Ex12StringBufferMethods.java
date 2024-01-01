@SuppressWarnings("all")
class Ex12StringBufferMethods {
    public static void main(String[] args) {
        char[] chars = {'7', '8'};
        StringBuffer sb1 = new StringBuffer("01");
        StringBuffer sb2 = sb1.append(23);
        sb1.append('4').append(56L);

        StringBuffer sb3 = sb1.append(chars);
        sb3.append(9.0f);

        System.out.println("sb1 =" + sb1);
        System.out.println("sb2=" + sb2);
        System.out.println("sb3=" + sb3);

        System.out.println("sb1 =" + sb1.deleteCharAt(10));
        System.out.println("sb1 =" + sb1.delete(3, 6));
        System.out.println("sb1 =" + sb1.insert(3, "abc"));
        System.out.println("sb1 =" + sb1.replace(6, sb1.length(), "END"));

        System.out.println("capacity=" + sb1.capacity());
        System.out.println("length=" + sb1.length());
    }
}