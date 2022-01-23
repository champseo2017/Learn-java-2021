package subclass;

public class Child2 extends Parent2 {
	private int y;
	public Child2() {
		super(3);
	}
	
	public static void main(String[] args) {
		Child2 child2 = new Child2();
		System.out.println("Child2 : Default constructor set y = " + child2.y);
	}
}