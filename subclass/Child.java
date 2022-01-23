package subclass;

public class Child extends Parent {
	private int y;
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println("Child : Default constructor set y = " 
		+ child.y);
	}
}