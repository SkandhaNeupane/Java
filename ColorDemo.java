import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ColorDemo extends JFrame implements ActionListener{
    
    JButton b1,b2;
    public ColorDemo(){
        setSize(300,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1 = new JButton("Black");
        b2 = new JButton("Blue");
        b1.setBounds(200,100,150,70);
        b2.setBounds(200,250,150,70);
        add(b1);add(b2);
        setLayout(null);
        setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
            getContentPane().setBackground(Color.BLACK);
        }
        else{
            getContentPane().setBackground(Color.BLUE);
        }
    }
    public static void main(String[] args){
        new ColorDemo();
    }
}
