import java.io.*;
public class FileToFileInputStream {
	// แสดงการอ่านข้อมูลเป็นไบต์ด้วยคลาส FileInputStream
	public static void main(String[] args) throws IOException {
		// ให้อ่านข้อมูลจากไฟล์ sampleout5.txt
		File inFile = new File("sampleout5.txt");
		FileInputStream inStream = new FileInputStream(inFile);
		int filesize = (int) inFile.length(); // หาขนาดของไฟล์
		// สร้างอาร์เรย์ที่มีขนาดเท่ากับขนาดของไฟล์
		byte[] byteArray = new byte[filesize];
		// อ่านข้อมูลจากไฟล์มาเก็บลงในอาร์เรย์ byteArray
		inStream.read(byteArray);
		for (int i = 0; i < filesize; i++)
			// พิมพ์ค่าข้อมูลในอาร์เรย์ byteArray ออกมาทีละค่า
			System.out.print(byteArray[i] + " ");
		inStream.close();
	}
}
