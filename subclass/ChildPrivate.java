package subclass;
import mainclass.*;
public class ChildPrivate extends MotherPrivate {
	public ChildPrivate() {
		System.out.println(x);
	}
	public static void main(String[] args) {
		new ChildPrivate();
	}
}
