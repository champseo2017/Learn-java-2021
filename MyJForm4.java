import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyJForm4 {
	public static void main(String[] args) {
		JFrame f = new JFrame("JFrame");
		JTextField t = new JTextField("JTextField", 20);
		JPasswordField pwdField = new JPasswordField("pwd", 10);
		JTextArea ta = new JTextArea("JTextArea", 5, 20);
		
		Container cp = f.getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(t);
		cp.add(pwdField);
		cp.add(ta);
		
//		f.setSize(400, 400);
//		f.setVisible(true);
		f.setSize(300, 200);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
