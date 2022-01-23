import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.awt.event.*;
public class LoginPassword implements ActionListener {
	private JLabel label;
	private JPasswordField passwordField;
	public LoginPassword() {
		Frame f = new Frame("Frame");
		Panel p = new Panel();
		label = new JLabel("Password");
		passwordField = new JPasswordField(15);
		p.add(label);
		p.add(passwordField);
		passwordField.addActionListener(this);
		f.add(p);
		f.setSize(400, 200);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
	    	  public void windowClosing(WindowEvent e) {
	    		  System.exit(0);
	    	  }
	     });
	}
	public void actionPerformed(ActionEvent e) {
		JDialog dialog = new JDialog();
		dialog.setTitle("Password");
		dialog.setSize(300, 100);
		dialog.setLocation(300, 200);
		JPanel panel = new JPanel();
		JLabel l = new JLabel("your password is " + 
		new String(passwordField.getPassword()));
		panel.add(l);
		dialog.getContentPane().add(panel);
		dialog.setVisible(true);
		dialog.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dialog.dispose(); 
			}
		});
	}
	public static void main(String[] args) {
		new LoginPassword();
	}
}
