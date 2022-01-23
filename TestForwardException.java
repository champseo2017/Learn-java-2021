
public class TestForwardException {
	public static void main(String[] args) {
		System.out.println("Main method call method A");
		TestForwardException t = new TestForwardException();
		t.A();
	}
	public void A() {
		System.out.println("Method A Call method B");
		B();
	}
	public void B() {
		try {
			double result = 2/0;
		} catch (ArithmeticException e) {
			System.out.println("Method B catch ArithmeticException" +
		    e.getMessage());
		}
	}
}
