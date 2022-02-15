import java.io.*;
/* 
 * คลาส InputStream ใช้สำหรับอ่านข้อมูลในรูปแบบของไบต์
 *  - FileInputStream, PipedInputStream, ByteArrayInputStream
 *  - StringBufferInputStream คลาสเหล่านี้เป็นสตรีมที่สามารถอ่านข้อมูลจาก source
 *  ได้โดยตรง
 *  เมธอดที่ใช้ในการอ่านข้อมูล
 *  int read() ใช้อ่านข้อมูล 1 ตัวอักษรเท่านั้น
 *  int read(char[] cbuf) ใช้อ่านข้อมูลตัวอักษรและเก็บข้อมูลที่อ่านได้ลงในอาร์เรย์ cbuf
 *  int read(char[] cbuf, int off, int len) ใช้อ่านข้อมูลตัวอักษร และ เก็บข้อมูลที่
 *  อ่านได้ลงในตำแหน่งที่ off ของอาร์เรย์ cbuf โดยจะอ่านข้อมูลเป็นจำนวนเท่ากับค่าของตัวแปร len
 *  
 *  คลาส OutputStream สตรีมที่ใช้เขียนสู่ destination ขนาด 8 บิต
 *  - FileOutputStream, PipedOutputStream, ByteArrayOutputStream 
 *  เป็นสตรีมที่สามารถเขียนลงสู่ destination ได้โดยตรง
 *  
 *  เมธอดที่ใช้ในการเขียนข้อมูล
 *   - int write() เขียนข้อมูล 1 ตัวอักษร
 *   - int write(char[] cbuf) ใช้เขียนข้อมูลตัวอักษรจากอาร์เรย์ cbuf ลงไปยัง destination
 *   - int write(char[] cbuf, int off, int len) ใช้เขียนข้อมูลตัวอักษรจากตำแหน่งที่ off
 *   ของอาร์เรย์ cbuf ลงไปยัง destination โดยจะเขียนข้อมูลเป็นจำนวนเท่ากับค่าของตัวแปร len
 * */
public class FileOutputStreamToFile {
	// เขียนข้อมูลเป็นไบต์ด้วยคลาส FileOutputStream
	public static void main(String[] args) throws IOException {
		File outFile = new File("sampleout5.txt");
	    FileOutputStream outStream = new FileOutputStream(outFile);
	    byte[] byteArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	    outStream.write(byteArray);
	    outStream.write(byteArray[2]);
	    outStream.write(byteArray[6]);
	    outStream.close();
	}
	// หลังจากรันโปรแกรมจะเห็นว่าเราไม่สามารถอ่านข้อมูลในไฟล์ sampleout5.txt ได้เข้าใจ นั่นเป็นเพราะ
	// เราทำการเขียนข้อมูลตัวเลขในลักษณะของไบต์ ไม่ได้เขียนข้อมูลเป็นตัวอักษร
}
