import java.awt.*;
import java.awt.event.*;
public class MyFrameAndDialog {
	public static void main(String[] args) {
		Frame f = new Frame("Frame");
		Dialog d = new Dialog(f, "Dialog");
		Label l = new Label("Label show on dialog");
		d.add(l);
		d.pack();
		f.setSize(500, 100);
		f.setVisible(true);
		d.setVisible(true);
		d.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
