public class Ex03CouldNotHandle {

    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s);
            System.out.println(s.length()); // NullPointerException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        System.out.println("Handled.");
    }

}
