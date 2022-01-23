
//public class TestFinal extends TestFinal1 {
	public class TestFinal extends Testfinal2 {
		public static void print123() {
			System.out.println
			("TestFinal:print():Non-static class");
			System.out.println
			("TestFinal:print():Non-static method");
			System.out.println
			("TestFinal:print():TestFinal");
		}
		public static void main(String[] args) {
			TestFinal.print123();
		}
}
