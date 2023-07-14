import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BarChart extends JPanel {

    private int[] data;

    public BarChart(int[] data) {
        this.data = data;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        int x = 0;
        for (int i = 0; i < data.length; i++) {
            g2d.setColor(Color.BLUE);
            g2d.fillRect(x, getHeight() - data[i], 20, data[i]);
            //g2d.setColor(Color.BLACK);
            g2d.drawRect(x, getHeight() - data[i], 20, data[i]);
            x += 30;
        }
    }

    public static void main(String[] args) {
        int[] data = {20,12,10,6};
        JFrame frame = new JFrame("Bar Chart Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        BarChart chart = new BarChart(data);
        frame.add(chart);
        frame.setVisible(true);
    }
}
