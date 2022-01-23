import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyJDialog {
	public static void main(String[] args) {
		JDialog d = new JDialog();
		d.setTitle("JDialog");
		d.setSize(300, 100);
		d.setLocation(300, 200);
		JPanel p = new JPanel();
		JLabel l1 = new JLabel("Are you sure to exit program?");
		JButton b1 = new JButton("yes");
		JButton b2 = new JButton("No");
		p.setLayout(new FlowLayout());
		p.add(l1);
		p.add(b1);
		p.add(b2);
		d.getContentPane().add(p);
		d.setVisible(true);
		d.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
