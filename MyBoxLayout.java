import java.awt.*;
import javax.swing.*;
public class MyBoxLayout extends JFrame {
    public MyBoxLayout(){
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Long Named Button 4");
        JButton b5 = new JButton("Button 5");
        add(b1);add(b2);add(b3);add(b4);add(b5);
        b1.setAlignmentX(Component.CENTER_ALIGNMENT);
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        b3.setAlignmentX(Component.CENTER_ALIGNMENT);
        b4.setAlignmentX(Component.CENTER_ALIGNMENT);
        b5.setAlignmentX(Component.CENTER_ALIGNMENT);
        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
        pack();
        setVisible(true);
    }
    public static void main(String[] args){
        new MyBoxLayout();
    }
}
