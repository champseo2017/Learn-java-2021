import java.io.*;
public class FileToBufferedReader {
	static BufferedReader in = null;
	public static void main(String[] args) {
		try {
			in = new BufferedReader(new FileReader(args[0]));
			/* สร้างออบเจ็คของคลาส BufferedReader ขึ้น โดยส่งออบเจ็คของคลาส
			 * FileReader ไปเป็นพารามิเตอร์ให้กับคอนสตรัคเตอร์ของคลาส
			 * BufferedReader เพื่อใช้ BufferedReader ในการอ่านข้อมูลจาก
			 * Source ผ่านท่าง FileReader อีกทีหนึ่ง
			 * FileReader สามารถอ่านข้อมูลจาก source ได้โดยตรง
			 * */
			String s1;
			String s2 = new String();
			// เมธอด readLine ของ BufferedReader ใช้อ่านข้อมูลตัวอักษรเข้ามา
			// ทีละบรรทัด
			while ((s1 = in.readLine()) != null) {
				s2 += s1 + "\n";
			}
			System.out.println(s2);
		} catch (EOFException e1) {
			System.out.println("End of stream");
		} catch (IOException e2) {
			System.out.println(e2.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please input filename");
		} finally {
			try {
				if (in != null) in.close();
			} catch (IOException e3) {
				System.out.println("Cannot close BufferedReader");
			}
		}
	}
	// การอ่านข้อมูลจาก source โดยใช้ BufferedReader ช่วยเพิ่มประสิทธิภาพการทำงานของ
	// โปรแกรมได้มาก เพราะเมธอด BufferedReader มีเมธอด readLine ที่สามารถอ่านข้อมูลเข้ามา
	// ได้ทั้งบรรทัด
}
