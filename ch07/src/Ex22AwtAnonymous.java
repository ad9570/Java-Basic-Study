import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("all")
class Ex22AwtAnonymous {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e) {
                                    System.out.println("ActionEvent occurred!!!");
                                }
                            }
        );
    }
}