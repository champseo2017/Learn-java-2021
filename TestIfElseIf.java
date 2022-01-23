
public class TestIfElseIf {
	public static void main(String[] args) {
		new TestIfElseIf().calGrade(72);
		new TestIfElseIf().calGrade(49);
		new TestIfElseIf().calGrade(80);
		new TestIfElseIf().calGrade(66);
	}

	public void calGrade(int points) {
		if (points >= 80)
			System.out.println("A");
		else if (points >= 70)
			System.out.println("B");
		else if (points >= 60)
			System.out.println("C");
		else if (points >= 50)
			System.out.println("D");
		else
			System.out.println("F");
		System.out.println("End calGrade");
	}
}
