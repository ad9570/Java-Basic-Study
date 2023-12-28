import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Hello {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello, world.");
        File f = new File("C:\\Users\\PMW\\Desktop\\fwef.txt");
        System.out.println("f = " + f);
        FileInputStream fi = new FileInputStream("C:\\Users\\PMW\\Desktop\\fwef.txt");
        FileOutputStream fo = new FileOutputStream("C:\\Users\\PMW\\Desktop\\fwet.txt");
    }
}
