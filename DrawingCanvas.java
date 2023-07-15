import java.awt.*;
import javax.swing.*;

public class DrawingCanvas extends JPanel {

    public DrawingCanvas() {
       setPreferredSize(new Dimension(400, 400));
     
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Display "Hello World"
        g.drawString("Hello World", 50, 50);

        // Draw a circle
        g.drawOval(100, 100, 100, 100);

        // Draw a rectangle
        g.drawRect(200, 200, 100, 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Drawing Canvas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new DrawingCanvas());
        frame.pack();
        frame.setVisible(true);
    }
}