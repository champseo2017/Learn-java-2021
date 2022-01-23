import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyJForm2 {
	public static void main(String[] args) {
		JFrame f = new JFrame("JFrame");
		JCheckBox chkBox1 = new JCheckBox("Checkbox1", true);
		JCheckBox chkBox2 = new JCheckBox("Checkbox2", false);
		JCheckBox chkBox3 = new JCheckBox("Checkbox3", false);
		JRadioButton r1 = new JRadioButton("RadioButton1", true);
		JRadioButton r2 = new JRadioButton("RadioButton2", false);
		JRadioButton r3 = new JRadioButton("RadioButton3", false);
		ButtonGroup group = new ButtonGroup();
		group.add(r1);
		group.add(r2);
		group.add(r3);
		
		Container cp = f.getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(chkBox1);
		cp.add(chkBox2);
		cp.add(r1);
		cp.add(r2);
		cp.add(r3);
		
		f.setSize(300, 100);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
