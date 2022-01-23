
public class ForEachArray {
	public static void main(String[] args) {
		char[] ch = { 'S', 'u', 'm', 'm', 'a', 't', 'i', 'o', 'n' };
		int[] num = { 1, 2, 3, 4, 5 };
		int result = 0;
		System.out.print("Number are ");
		for (int int_val : num) {
			System.out.print(int_val + " ");
			result += int_val;
		}
		System.out.println();
		for (char char_val : ch) {
			System.out.print(char_val);
		}
		System.out.println(" is " + result);
	}
}
