import javax.swing.*;
import java.awt.*;
public class Layout2 extends JFrame {
    JButton b1,b2,b3,b4;
    public Layout2(){
        setSize(200,200);
        setTitle("Grid Layout");
        JButton b1 = new JButton("JAVA");
        JButton b2 = new JButton("IS");
        JButton b3 = new JButton("VERY");
        JButton b4 = new JButton("EASY");
        setLayout(new GridLayout(2,2,15,15));
        add(b1);add(b2);add(b3);add(b4);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new Layout2();
    }
}
