import java.io.*;
// การระบุชื่อ input file ลงไปในโปรแกรมโดยตรง
public class TestBufferedReader {
	public static void main(String[] args) throws IOException {
		// โปรแกรมไม่ต้องการดักจับ exception ที่อาจเกิดขึ้น ดังนั้นจึงระบุ throws 
		// IOException ไว้ที่บรรทัดการประกาศเมธอด main เพื่อส่งต่อ exception ที่
		// เกิดขึ้นให้ JVM
		File inFile = new File("sample4.txt");
		// ไม่ต้องการรับชื่อของ input file เข้ามาทาง command-line argument
		// จึงกำหนดชื่อ input file ไว้ในโปรแกรมโดยตรง
		FileReader fReader = new FileReader(inFile);
		BufferedReader bufReader = new BufferedReader(fReader);
		String str;
		while ((str = bufReader.readLine()) != null) {
			System.out.println(str);
		}
		bufReader.close();
	}
}
