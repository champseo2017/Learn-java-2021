
public class TestIfElse {
	public static void main(String[] args) {
		new TestIfElse().calGrade(72);
		System.out.println();
		new TestIfElse().calGrade(49);
	}
	public void calGrade(int points) {
		if (points > 50) {
			System.out.println("Your points more than 50");
			System.out.println("Not Fail");
		} else {
			System.out.println("Your points less than 50");
			System.out.println("Fail !!!");
		}
		System.out.println("End calGrade");
	}
}
