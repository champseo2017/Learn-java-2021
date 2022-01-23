import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyJLabel {
  public static void main(String[] args) {
	  JFrame f = new JFrame("JFrame");
	  JLabel l = new JLabel("JLabel");
	  Container cp = f.getContentPane();
	  cp.add(l);
	  f.setSize(500, 500);
	  f.setVisible(true);
	  f.addWindowListener(new WindowAdapter() {
		  public void windowClosing(WindowEvent e) {
			  System.exit(0);
		  }
	  });
  }
}
