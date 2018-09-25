import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JFrameTest{
   public static void main(String[] args){
      Rectangle rect = new Rectangle(0,0,100,100);
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);


      JOptionPane.showMessageDialog(frame, "Click OK to continue");
      frame.setBounds(rect);
      // Your work goes here: Move the rectangle and set the frame bounds again
      rect.translate(900,900);
      frame.setBounds(rect);
   }
}