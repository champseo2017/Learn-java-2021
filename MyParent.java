
public class MyParent extends MyGrandparent {
	MyParent() {
		this(100);
		System.out.println("MyParent() constructor");
	}
	MyParent(int x) {
		//super();
		System.out.println("MyParent(" + x + ") constructor");
	}
}
