import javax.swing.*;
import java.awt.*;
public class PieChart extends JFrame {
    int[] data = {20,12,10,6};
    ColorDemo[] colors = {Color.RED,Color.BLUE,Color.YELLOW,Color.GREEN};
    public PieChart(){
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
    public int getTotal(){
        int sum = 0;
        for(int i:data){
            sum = sum+i;
        }
        return sum;
    }

    public void paint(Graphics g){
        int setAngle = 0;
        int total = getTotal();
        for(int i=0;i<data.length;i++){
            int arcAngle = (int) (data[i]/(double)total*360);
            g.setColor(colors[i]);
            g.fillArc(50,50,200,200,setAngle,arcAngle);
            setAngle = setAngle + arcAngle;
        }
    }

    public static void main(String[] args){
        new PieChart();
    }
}
