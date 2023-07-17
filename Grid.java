import java.awt.*;
import javax.swing.*;
public class Grid extends JFrame {
    public Grid(){
        setSize(200,200);
        setTitle("Grid Layout");
        JButton one = new JButton("JAVA");
        JButton two = new JButton("IS");
        JButton three = new JButton("VERY");
        JButton four = new JButton("EASY");
        setLayout(new GridBagLayout());
        //Create an object for GridBagLayout
        GridBagConstraints gbc = new GridBagConstraints();
        //Components should expand to fill the avilable space
        //So set the fill constraint to BOTH
        gbc.fill = GridBagConstraints.BOTH;
        //Set the weight of x and y to non zero value
        gbc.weightx = 1;
        gbc.weighty =1;

        //Scinece the height of the button one is twice compared to others
        //Set constraint height to 2
        gbc.gridheight = 2;
        //This button has x = 0 and y = 0
        gbc.gridx = 0;
        gbc.gridy = 0;
        //add the first button
        add(one,gbc);

        //Set the height back to one
        gbc.gridheight = 1;
        //button two is at x=1 and y=0
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(two,gbc);

        //button three has x=2 and y=0
        gbc.gridx = 2;
        gbc.gridy = 0;
        add(three,gbc);

        //button four has double width and its x=1 and y=1
        gbc.gridwidth = 2;
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(four,gbc);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args){
        new Grid();
    }
}
