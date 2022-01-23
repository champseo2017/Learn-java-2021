
public class TestStaticMethod {
	public static void main(String[] args) {
		System.out.print("number = " + Calculate.cal(3));
	}
}

class Calculate {
	public static int cal(int number) {
		return number + 3;
	}
}
