package subclass;
import mainclass.*;

public class ChildPublic {
	public ChildPublic() {
		System.out.println(new MotherPublic().x);
	}
	public static void main(String[] args) {
		new ChildPublic();
	}
}
