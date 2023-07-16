import javax.swing.*;
import java.awt.*;
public class GermanFlag extends JFrame {
    public GermanFlag(){
        setSize(500,500);
        setTitle("German Flag");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }
    public void paint(Graphics g){
        final int x = 200;
        final int y = 200;
        final int width = 120;
        final int height = 30;
        Color[] clr = {Color.BLACK,Color.RED,Color.YELLOW};
        //Color[] clr = {Color.GREEN,Color.WHITE,Color.RED};
        for(int i=0;i<3;i++){
            g.setColor(clr[i]);
            g.fillRect(x, y+(i*height), width, height);
            //g.fillRect(x+(i*width), y, width, height);
        }
    }
    public static void main(String[] args){
        new GermanFlag();
    }
}
