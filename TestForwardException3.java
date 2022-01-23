
public class TestForwardException3 {
	public static void main(String[] args) {
		System.out.println("Main method call method A");
		TestForwardException3 t3 = new TestForwardException3();
		try {
			t3.A();
		} catch (ArithmeticException e) {
			System.out.println("This is main method");
			System.out.println("Main method receives exception " + 
			e.getMessage());
		}
	}
	public void A() throws ArithmeticException {
		System.out.println("Method A call method B");
		B();
	}
	public void B() throws ArithmeticException {
		double result = 2 / 0;
		System.out.println("This is method B");
	}
}
