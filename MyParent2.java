
public class MyParent2 extends MyGrandparent2 {
	MyParent2() {
		this(100);
		System.out.println("MyParent2() constructor");
	}
	MyParent2(int x) {
		super(200);
		System.out.println("MyParent2("+ x + ") constructor");
	}
}
