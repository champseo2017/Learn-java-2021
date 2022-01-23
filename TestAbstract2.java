
abstract class TestAbstract {
	public abstract void a1();
	public abstract void a2();
	public void a3() {
		System.out.println("Test A3");
	}
}

class TestAbstract2 extends TestAbstract {
	public static void main(String[] args) {
		TestAbstract2 m = new TestAbstract2();
		m.a1();
	}
	public void a1() {
		System.out.println("Test A1");
	}
	public void a2() {}
}