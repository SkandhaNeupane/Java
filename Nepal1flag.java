import java.awt.*;
import javax.swing.*;
public class Nepal1flag extends JFrame{
    public Nepal1flag(){
        setSize(500,500);
        setTitle("Nepal Flag");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }
    public void paint(Graphics g){
        int[] x = {100,200,100};
        int[] y1 = {50,100,150};
        int[] y2 = {150,200,250};
        g.setColor(Color.RED);
        g.fillPolygon(x,y1,3);
        g.fillPolygon(x,y2,3);
        g.drawLine(100,50,100,300);
        
    }
    public static void main(String[] args){

        new Nepal1flag();
    }
}