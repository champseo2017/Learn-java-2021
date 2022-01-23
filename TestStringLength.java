import java.io.*;
public class TestStringLength {
	public static void main(String[] args) {
		String message;
		int len;
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		System.out.print("Enter your text here : ");
		try {
			message = in.readLine();
			len = message.length();
			System.out.println("Length of your text \"" + message +
					"\" is " + len);
		} catch (IOException e) {
			System.out.println("Read input keyboard error");
		}
	}
}
