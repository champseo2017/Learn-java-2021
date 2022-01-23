import java.awt.*;
import java.awt.event.*;
public class Login implements MouseListener {
   private TextField t;
   public Login() {
      Frame f = new Frame("Frame");
      Panel p = new Panel();
      Label l = new Label("name");
      t = new TextField(15);
      Button b = new Button("login");
      b.addMouseListener(this);
      p.add(l);
      p.add(t);
      p.add(b);
      f.add(p);
      f.setSize(150, 150);
      f.setVisible(true);
      f.addWindowListener(new WindowAdapter() {
    	  public void windowClosing(WindowEvent e) {
    		  System.exit(0);
    	  }
      });
   }
   public void mousePressed(MouseEvent e) { } 
   public void mouseReleased(MouseEvent e) { }
   public void mouseEntered(MouseEvent e) { }
   public void mouseExited(MouseEvent e) { }
   public void mouseClicked(MouseEvent e) {
      String name = t.getText();
      System.out.println("Hello " + name);
   }
   public static void main(String[ ] args) {
      new Login();
   }
}
