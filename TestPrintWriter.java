import java.io.*;
// ไม่ต้องการเก็บข้อมูลเป็นไบต์
// ใช้คลาส PrintWriter มาใช้โดยคลาสนี้จะทำการสร้างแท็กซ์ไฟล์ (text file หรือ ASCII file)
// คลาส PrintWriter ไม่มีเมธอด write แต่จะมีเมธอด print และ println ให้เรียกใช้งานแทน
// การทำงานของ PrintWriter คือ จะทำการแปลงค่าข้อมูลทั้งหมดให้เป็นสตริงก่อน แล้วจึงเขียนข้อมูลลงไฟล์
public class TestPrintWriter {
	public static void main(String[] args) throws IOException {
		File outFile = new File("sampleout6.txt");
		FileOutputStream outFStream = new FileOutputStream(outFile);
		PrintWriter outStream = new PrintWriter(outFStream);
		outStream.println(123);
		outStream.println(456L);
		outStream.println(7.8f);
		outStream.println(9.0);
		outStream.println('0');
		outStream.println(true);
		outStream.close();
	}
}
