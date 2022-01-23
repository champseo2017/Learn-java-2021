package subclass;

public class Calculator extends TestCalculator {
	public static void main(String[] args) {
		new TestCalculator();
		new TestCalculator(1, 2);
		new TestCalculator(1);
		new TestCalculator(1, 2, 3);
	}
}
