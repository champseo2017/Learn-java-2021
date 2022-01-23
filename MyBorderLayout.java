import java.awt.*;
import java.awt.event.*;
public class MyBorderLayout {
	public static void main(String[] args) {
		Frame f = new Frame("Frame");
		Label l = new Label("name");
		TextField t = new TextField(15);
		Button b = new Button("login");
		f.add(l);
		f.add(t);
		f.add(b);
//		f.add(l, BorderLayout.WEST);
//		f.add(t, BorderLayout.CENTER);
//		f.add(b, BorderLayout.EAST);
		f.setSize(300, 80);
		Panel p = new Panel();
		p.add(l);
		p.add(t);
		p.add(b);
		f.add(p);
		f.pack();
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
}
