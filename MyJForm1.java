import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyJForm1 {
 public static void main(String[] args) {
	 JFrame f = new JFrame("JFrame");
	 Panel p = new Panel();
	 JButton b = new JButton("JButton");
	 JToggleButton tb = new JToggleButton("JToggleButton");
	 p.setLayout(new FlowLayout());
	 p.add(b);
	 p.add(tb);
	 f.getContentPane().add(p);
	 f.setSize(400, 100);
	 f.setVisible(true);
	 f.addWindowListener(new WindowAdapter() {
		 public void windowClosing(WindowEvent e) {
			 System.exit(0);
		 }
	 });
 }
}
