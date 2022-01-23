import java.awt.*;
import java.awt.event.*;
public class FrameWithEvent {
	public static void main(String[] args) {
		Frame f = new Frame("Frame");
		f.setSize(300, 100);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
