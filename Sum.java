import java.awt.event.*;
import javax.swing.*;

public class Sum extends JFrame implements ActionListener{
    JTextField t1,t2,t3;
    JButton add,sub;
    public Sum(){
        setSize(300,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        add = new JButton("Add");
        sub = new JButton("Sub");
        t1.setBounds(200,100,150,70);
        t2.setBounds(200,250,150,70);
        t3.setBounds(200,400,150,70);
        add.setBounds(100,700,100,70);
        sub.setBounds(600,700,100,70);
        add(t1);add(t2);add(t3);
        add(add);add(sub);
        setLayout(null);
        setVisible(true);
        add.addActionListener(this);
        sub.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        if(e.getSource() == add){
            int ans = a+b;
            t3.setText(""+ans);
        }
        else{
            int ans = a-b;
            t3.setText(""+ans);
        }
    }
    public static void main(String[] args){
        new Sum();
    }
}
