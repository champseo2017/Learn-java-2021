
public class TestSwitchCase {
	public static void main(String[] args) {
		new TestSwitchCase().calGrade(3);
		System.out.println();
		new TestSwitchCase().calGrade(4);
		System.out.println();
		new TestSwitchCase().calGrade(1);
		System.out.println();
		new TestSwitchCase().calGrade(0);
		System.out.println();
	}

	public void calGrade(int grade) {
		switch (grade) {
		case 4:
			System.out.println("A");
			System.out.println("Very good");
			break;
		case 3:
			System.out.println("B");
			break;
		case 2:
			System.out.println("C");
			break;
		case 1:
			System.out.println("D");
		default:
			System.out.println("F");
			System.out.println("You fail, try again!!!");
		}
	}
}
