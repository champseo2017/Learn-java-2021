import java.awt.*;
import java.awt.event.*;
public class MyForm1 {
	public static void main(String[] args) {
		Frame f = new Frame("Frame");
		Button b = new Button("Button");
		Checkbox chkbox1 = new Checkbox("checkbox1", true);
		Checkbox chkbox2 = new Checkbox("checkbox2", false);
		Checkbox chkbox3 = new Checkbox("checkbox3", false);
		
		CheckboxGroup chkboxgroup = new CheckboxGroup();
		Checkbox chkboxgrp1 = new Checkbox("checkboxgroup1", 
				chkboxgroup, true);
		Checkbox chkboxgrp2 = new Checkbox("checkboxgroup2", chkboxgroup, 
				false);
		Checkbox chkboxgrp3 = new Checkbox("checkboxgroup3", chkboxgroup, 
				false);
		f.setLayout(new FlowLayout());
		f.add(b);
		f.add(chkbox1);
		f.add(chkbox2);
		f.add(chkbox3);
		f.add(chkboxgrp1);
		f.add(chkboxgrp2);
		f.add(chkboxgrp3);
		f.setSize(400, 100);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
