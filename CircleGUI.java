import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CircleGUI extends JFrame implements ActionListener {
    private JTextField radiusField;
    private JLabel resultLabel;
    
    public CircleGUI() {
        // Set up the window
        setTitle("Circle Area Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        
        // Set up the components
        JLabel radiusLabel = new JLabel("Radius:");
        radiusField = new JTextField(10);
        JButton calcButton = new JButton("Calculate");
        calcButton.addActionListener(this);
        resultLabel = new JLabel("Area will be shown here");
        
        // Add the components to the window
        JPanel contentPane = new JPanel();
        contentPane.setLayout(new GridLayout(3, 2));
        contentPane.add(radiusLabel);
        contentPane.add(radiusField);
        contentPane.add(calcButton);
        contentPane.add(resultLabel);
        setContentPane(contentPane);
        
        // Show the window
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Calculate")) {
            double radius = Double.parseDouble(radiusField.getText());
            double area = Math.PI * radius * radius;
            resultLabel.setText("Area: " + area);
        }
    }
    
    public static void main(String[] args) {
        new CircleGUI();
    }
}
