import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, world.");
        File f = new File("C:\\Users\\PMW\\Desktop\\fwef.txt");
        System.out.println("f = " + f);
        try (FileInputStream fi = new FileInputStream("C:\\Users\\PMW\\Desktop\\fwef.txt");
             FileOutputStream fo = new FileOutputStream("C:\\Users\\PMW\\Desktop\\fwet.txt")) {
            System.out.println(fi);
            System.out.println(fo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
