import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class TestMultiListener implements TextListener, MouseListener {
	public TextField textField;
	public Label label;
	public TestMultiListener() {
		Frame f = new Frame();
		f.setLayout(new BorderLayout());
		textField = new TextField(10);
		label = new Label("");
		Button button = new Button("OK");
		Panel panel = new Panel();
		textField.setEchoChar('*');
		textField.addTextListener(this);
		panel.add(textField);
		button.addMouseListener(this);
		panel.add(button);
		
		f.add(panel, BorderLayout.NORTH);
		f.add(label, BorderLayout.CENTER);
		f.setSize(400, 200);
		f.setVisible(true);
	}
	public void textValueChanged(TextEvent e) {
		label.setText("Your text is" + textField.getText());
	}
	public void mousePressed(MouseEvent e) {
		String str = textField.getText();
		label.setText("Length of text \"" + str + "\" is " + 
		str.length());
	}
	// เมธอดนี้ทำงานเมื่อปล่อยเมาส์หลังจากที่นำเมาส์ไปกดที่คอมโพเนนต์
	public void mouseReleased(MouseEvent e) {}
	
	// เมธอดนี้จะทำงานเมื่อเลื่อนเมาส์ไปที่คอมโพเนนต์
	public void mouseEntered(MouseEvent e) {}
	
	// เมธอดนี้ทำงานเมื่อเลื่อนเมาส์ออกจากคอมโพเนนต์
	public void mouseExited(MouseEvent e) {}
	
	// เมธอดนี้จะทำงานเมื่อนำเมาส์ไปคลิก (กดและปล่อยปุ่มเมาส์) ที่คอมโพเนนต์
	public void mouseClicked(MouseEvent e) {}
	
	public static void main(String args[]) {
		new TestMultiListener();
	}
	
}
