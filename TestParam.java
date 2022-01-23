
public class TestParam {
	TestParam(int x) {
		x++;
		System.out.print("x=" + x + "\t");
	}
	TestParam(double x, int y) {
		x = x + y;
		System.out.print("x = " + x + "\t");
	}
	TestParam(float x, int y) {
		x = x - y;
		System.out.print("x=" + x + "\t");
	}
	
	public static void main(String[] args) {
		new TestParam(5);
		new TestParam(5.0, 5);
		new TestParam(50.5f, 50);
		System.out.println();
		new TestParam(5);
		new TestParam(5.0, 5);
		new TestParam(50.5, 50);
	}
}
