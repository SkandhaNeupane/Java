import java.awt.*;
public class NepalFlag extends Panel{
   
// we shall draw two triangles to create the flag
public void paint(Graphics g){
g.setColor(Color.RED);
// Lets define the x coordinates
int [] x1 = {50, 150, 50};
int [] y1 = {50, 100, 150};
// draw upper triangle
g.fillPolygon(x1, y1, 3);
// coordinates of second triangle
int [] x2 = { 50, 150,50}; // this is not necessary since it stays same as previous

int [] y2 = {150, 200,250};
g.fillPolygon(x2, y2, 3);
g.setColor(Color.BLACK);
g.drawLine(50,50, 50, 300);
}
public static void main(String [] args ){
//Since we have extended panel, we have to create Frame manually 
Frame frame = new Frame("Nepali Flag");
frame.setSize(400,500);
// Add the panel with the drawing to this frame
frame.add(new NepalFlag());
frame.setVisible(true);
}
}