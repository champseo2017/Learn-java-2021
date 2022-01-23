
public class TestFor {
	public static void main(String[] args) {
		for (int count = 0; count <= 5; count++) {
			if (count != 4) {
				System.out.println(count);
			} else {
				break;
			}
		}
		System.out.println("End For");
	}
}
