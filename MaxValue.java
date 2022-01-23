import java.io.*;
public class MaxValue {
	public static void main(String[] args) {
		String s[] = new String[3];
		int num[] = new int[3];
		int max; // เก็บค่าสูงสุด
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		try {
			System.out.print("Please enter number 1 : ");
			s[0] = in.readLine();
			System.out.print("Please enter number 2 : ");
			s[1] = in.readLine();
			System.out.print("Please enter number 3 : ");
			s[2] = in.readLine();
			for (int i = 0; i < s.length; i++) {
				num[i] = Integer.parseInt(s[i]);
			}
			max = num[0];
			for (int i = 1; i < num.length; i++) {
				if (num[i] > max) { max = num[i]; }
			}
			System.out.println("Max value is " + max);
		} catch (IOException e) {
			System.out.println("Read input keyboard error");
		}
	}
}
