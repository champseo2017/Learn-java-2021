
public class TestIf {
	public static void main(String[] args) {
		new TestIf().calGrade(72);
		System.out.println();
		new TestIf().calGrade(49);
	}

	public void calGrade(int points) {
		if (points > 50) {
			System.out.println("Your points more than 50");
			System.out.println("Not Fail");
		}
		System.out.println("End calGrade");
	}
}
