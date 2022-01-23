import java.awt.*;
import java.awt.event.*;
public class MyFrameAndLabel {
	public static void main(String[] args) {
		Frame f = new Frame("Frame");
		Label l = new Label("Label");
		f.add(l);
		f.setSize(100, 100);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
