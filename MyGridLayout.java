import java.awt.*;
import java.awt.event.*;
public class MyGridLayout {
	public static void main(String[] args) {
		Frame f = new Frame("Frame");
		Label l = new Label("name");
		TextField t = new TextField(15);
		Button b = new Button("login");
		f.setLayout(new GridLayout(2, 2));
		f.add(l);
		f.add(t);
		f.add(b);
		f.pack();
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
