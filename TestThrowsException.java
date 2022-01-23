
public class TestThrowsException {
	public static void main(String[] args) {
		TestThrowsException t = new TestThrowsException();
		t.A();
	}
	public void A() {
		try {
			B();
		} catch (ArithmeticException e) {
			System.out.println("A catch ArithmeticException, " +
		     e.getMessage());
		}
	}
	public void B() throws ArithmeticException {
		try {
			System.out.println("2/0 = " + (2/0));
		} catch (ArithmeticException e) {
			System.out.println("B catch ArithmeticException " + 
		    e.getMessage());
			System.out.println("B throw ArithmeticException to caller "
					+ "method");
			throw new ArithmeticException("This exception throw from B");
		}
	}
}
