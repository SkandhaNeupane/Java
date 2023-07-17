import javax.swing.*;
import java.awt.*;
public class Gridlayout extends JFrame {
    JButton[] btns;
    public Gridlayout(){
        btns = new JButton[4];
        for(int i=0;i<=3;i++){
            btns[i] = new JButton("b"+(i+1));
            add(btns[i]);
        }
        setLayout(new GridLayout(2,2));
        setSize(200,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new Gridlayout();
    }
}
