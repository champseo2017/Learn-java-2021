import java.io.*;
// อ่านข้อมูลจาก Keyboard
public class KeyboardInput {
	static BufferedReader stdin = null;
	public static void main(String args[]) {
		String data;
		try {
			stdin = new BufferedReader
					(new InputStreamReader(System.in));
			// ใช้ InputStreamReader อ่านข้อมูลจาก System.in
			// ซึ้งเป็น InputStream ก่อน หลังจากนั้นจึงใช้ BufferedReader
			// ทำการอ่านข้อมูลทีละบรรทัด
			System.out.print("input : ");
			data = stdin.readLine();
			System.out.println(data);
		} catch (IOException e1) {
			System.out.println(e1.getMessage());
		} finally {
			try {
				if (stdin != null) stdin.close();
			} catch (IOException e2) {
				System.out.println("Cannot close BufferedReader");
			}
		}
	}
}
