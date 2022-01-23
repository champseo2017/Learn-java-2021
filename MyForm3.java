import java.awt.*;
import java.awt.event.*;
public class MyForm3 {
	public static void main(String[] args) {
		Frame f = new Frame("Frame");
		TextField tf = new TextField("TextField", 20);
		TextArea ta = new TextArea("TextArea", 5, 20);
		
		f.setLayout(new FlowLayout());
		f.add(tf);
		f.add(ta);
		f.pack();
		f.setSize(1280, 760);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
