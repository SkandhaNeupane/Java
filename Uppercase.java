import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;
public class Uppercase extends JFrame implements ActionListener {
   Scanner scn = new Scanner(System.in);
    JTextField t;
    JButton b;
    public Uppercase(){
        setSize(500,1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t = new JTextField();
        b = new JButton("Click Here");
        t.setBounds(200,100,150,70);
        b.setBounds(200,250,150,70);
        add(t);add(b);
        setLayout(null);
        setVisible(true);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
     //String a = scn.nextLine();
     String a = t.getText();
     if(e.getSource() == b){
        String b = a.toUpperCase();
        t.setText(b);
        t.setBackground(Color.RED);
     }
     
    }
    public static void main(String[] args) {
        new Uppercase();
    }
}
