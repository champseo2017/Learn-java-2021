import java.awt.*;
import java.awt.event.*;
public class MyForm2 {
	public static void main(String[] args) {
		Frame f = new Frame("Frame");
		Choice c = new Choice();
		c.addItem("choice1");
		c.addItem("choice2");
		c.addItem("choice3");
		
		List l = new List(5);
		l.add("List1");
		l.add("List2");
		l.add("List3");
		l.add("List4");
		
		f.setLayout(new FlowLayout());
		f.add(c);
		f.add(l);
		f.pack();
		f.setSize(150, 150);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
