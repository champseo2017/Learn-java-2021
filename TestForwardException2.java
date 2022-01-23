
public class TestForwardException2 {
	public static void main(String[] args) {
		System.out.println("Main method call method A");
		TestForwardException2 t2 = new TestForwardException2();
		t2.A();
	}
	public void A() {
		System.out.println("Method A call method B");
		try {
			B();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
	public void B() throws ArithmeticException {
		double result = 2 / 0;
		System.out.println("This is method B");
	}
}
