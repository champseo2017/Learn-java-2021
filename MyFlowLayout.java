import java.awt.*;
import java.awt.event.*;
public class MyFlowLayout {
	public static void main(String[] args) {
		Frame f = new Frame("Frame");
		Panel p = new Panel();
		Label l = new Label("name");
		TextField t = new TextField(15);
		Button b = new Button("login");
		p.add(l);
		p.add(t);
		p.add(b);
		f.add(p);
		f.setSize(150, 150);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
