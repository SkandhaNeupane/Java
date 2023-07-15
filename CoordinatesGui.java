import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CoordinatesGui extends JFrame implements MouseListener, MouseMotionListener{
    JFrame f;
    JTextField t1,t2;
    public CoordinatesGui(){
        setSize(200,300);
        t1 = new JTextField();
        t2 = new JTextField();
        t1.setBounds(150,100,300,75);
        t2.setBounds(150,300,300,75);
        add(t1);add(t2);
        addMouseListener(this);
        addMouseMotionListener(this);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void mouseEntered(MouseEvent e){
        t1.setText("IN");
    }
    public void mouseExited(MouseEvent e){
        t1.setText("Out");
        Font fnt = new Font("Arial",Font.BOLD,20);
        t1.setFont(fnt);
    }
    public void mouseMoved(MouseEvent e){
        String coord = "X"+e.getX()+ "Y"+e.getY();
        t2.setText(coord);
    }
    public void mouseClicked(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseDragged(MouseEvent e){}

    public static void main(String[] args){
        new CoordinatesGui();
    }
    
}
