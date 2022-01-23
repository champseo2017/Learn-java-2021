import java.io.*;
public class TestFinally {
	private static int num;
	public static void main(String[] args) {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		try {
			System.out.print("please input number : ");
			num = Integer.parseInt(in.readLine());
		} catch (IOException e1) {
			System.out.println("Keyboard input error");
		} catch (NumberFormatException e2) {
			System.out.println("Input error, please"
					+ " input number only");
		} finally {
			System.out.println("IMPORTANT : you have to input number only");
		}
		System.out.println("Your number is : " + num);
	}
}
