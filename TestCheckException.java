import java.io.*;
public class TestCheckException {
	private static int num;
	public static void main(String[] args) {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		try {
			System.out.print("please input number: ");
			num = Integer.parseInt(in.readLine());
		} catch (Exception e) {
			System.out.println("program has some error wuth " + e.getMessage());
		}
		System.out.println("Your number is: " + num);
	}
}
