import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyJForm3 {
	public static void main(String[] args) {
		String[] myList = {"JList1", "JList2", "JList3", "JList4"};
		JFrame f = new JFrame("JFrame");
		JComboBox c = new JComboBox();
		c.addItem("JComboBox1");
		c.addItem("JComboBox2");
		c.addItem("JComboBox3");
		
		JList l = new JList(myList);
		l.setSelectedIndex(0);
		
		Container cp = f.getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(c);
		cp.add(l);
		
		f.setSize(300, 200);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
