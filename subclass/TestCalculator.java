package subclass;

public class TestCalculator {
	public int sum;

	public TestCalculator() {
		sum = 0;
		System.out.println("Calculator with no parameter");
		System.out.println("Sum=" + sum);
	}

	public TestCalculator(int x) {
		sum = x;
		System.out.println("Calculator with parameter x = " + x);
		System.out.println("sum = " + sum);
	}

	public TestCalculator(int x, int y) {
		sum = x + y;
		System.out.println("Calculator with parameter x = " 
		+ x + " y=" + y);
		System.out.println("sum = " + sum);
	}
	public TestCalculator(int x, int y, int z) {
		sum = x + y + z;
		System.out.println("Calculator with parameter x = " 
		+ x + " y=" + y + " z=" + z);
		System.out.println("sum = " + sum);
	}
}
