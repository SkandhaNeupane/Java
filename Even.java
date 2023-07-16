import javax.swing.*;
import java.awt.event.*;
public class Even extends JFrame implements ActionListener {
    private JTextField t1,t2;
    private JButton b;
    public Even(){
        setSize(800,1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t1 = new JTextField();
        t2 = new JTextField();
        t2.setEditable(false);
        b = new JButton("Click Here");
        t1.setBounds(200,100,150,70);
        t2.setBounds(200,250,150,70);
        b.setBounds(100,700,100,70);
        add(t1);add(t2);add(b);
        setLayout(null);
        setVisible(true);
        b.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        int a = Integer.parseInt(t1.getText());
        if(e.getSource() == b){
            if(a%2 == 0){
                //System.out.println("The number is odd");
                t2.setText("The number is even");
            }
            else{
                t2.setText("The number is odd");
            }
        }
    }
    public static void main(String[] args){
        new Even();
    }
    
}
