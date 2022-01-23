
public class TestConvertNumber {
	public static void main(String[] args) {
		int num1 = 123;
		double num2 = 45.67;
		String s1, s2;
		s1 = "" + num1;
		s2 = "" + num2;
		System.out.println("Convert integer " + num1 + 
				" to String \"" + s1 + "\"");
		System.out.println("Convert double " + num2 + " to String \"" 
				+ s2 + "\"" );
		System.out.println("Convert integer " + num1 + " to String \"" 
				+ Integer.toString(num1) + "\"" );
		System.out.println("Convert Double " + num2 + " to String \"" 
				+ Double.toString(num2) + "\"" );
	}
}
