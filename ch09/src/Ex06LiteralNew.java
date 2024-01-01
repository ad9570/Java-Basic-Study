@SuppressWarnings("all")
class Ex06LiteralNew {
    public static void main(String[] args) {
        String str1 = "abc";    // 값이 같으면 같은 String 인스턴스 공유
        String str2 = "abc";    // 값이 같으면 같은 String 인스턴스 공유
        System.out.println("String str1 = \"abc\";");
        System.out.println("String str2 = \"abc\";");

        System.out.println("str1 == str2 ?  " + (str1 == str2) + "(인스턴스 주소 비교)");
        System.out.println("str1.equals(str2) ? " + str1.equals(str2) + "(저장된 값 비교)");
        System.out.println();

        String str3 = new String("abc");    // 값이 같아도 각각 다른 String 인스턴스 사용
        String str4 = new String("abc");    // 값이 같아도 각각 다른 String 인스턴스 사용

        System.out.println("String str3 = new String(\"abc\");");
        System.out.println("String str4 = new String(\"abc\");");

        System.out.println("str3 == str4 ? " + (str3 == str4) + "(인스턴스 주소 비교)");
        System.out.println("str3.equals(str4) ? " + str3.equals(str4) + "(저장된 값 비교)");
    }
}