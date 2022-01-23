
class TestOverLoadMethod {
	public static void main(String[] args) {
		TestOverLoadMethod tom = new TestOverLoadMethod();
		if (args.length == 0 || args.length > 2) {
			System.out.println("Please input data");
			System.out.println("Print message only => message");
			System.out.println("Print message with sign => message sign");
		} else if (args.length == 1) {
			tom.testPrint(args[0]);
		} else if (args.length == 2) {
			tom.testPrint(args[0], args[1]);
		}
	}
	public void testPrint(String msg) {
		System.out.println(msg);
	}
	public void testPrint(String msg, String sign) {
		int len = msg.length();
		for (int i = 0; i < len + 2; i++)
			System.out.print(sign);
			System.out.println();
			System.out.print(sign);
			System.out.print(msg);
			System.out.print(sign);
			System.out.println();
			for (int k = 0; k < len + 2; k++) {
				System.out.print(sign);
			}
	}
}
