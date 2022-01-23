
class MyException extends Exception {
	MyException(String s) {
		System.out.println(s);
	}
}

public class TestMyException {
	static void welcome(String s) throws MyException {
		if (s.equals("JAVA"))
			System.out.println("WELCOME TO JAVA WORLD");
		else
			throw new MyException(s + " not allowed here");
	}
	public static void main(String[] args) {
		try {
			welcome(args[0]);
		} catch (MyException e1) {
			System.out.println("Exception of type MyException is thrown");
		} catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println("Please input subject");
		}
	}
}
