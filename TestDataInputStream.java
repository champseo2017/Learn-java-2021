import java.io.*;
public class TestDataInputStream {
	// แสดงการอ่านข้อมูลที่มีชนิดข้อมูลเป็น primitive data type จากไฟล์ด้วย
	// คลาส DataInputStream
	public static void main(String[] args) throws IOException {
		// ให้อ่านข้อมูลจากไฟล์ sampleout7.txt 
		File inFile = new File("sampleout7.txt");
		FileInputStream inFileStream = new FileInputStream(inFile);
		DataInputStream inDataStream = new DataInputStream(inFileStream);
		System.out.println(inDataStream.readInt());
		System.out.println(inDataStream.readLong());
		System.out.println(inDataStream.readFloat());
		System.out.println(inDataStream.readDouble());
		System.out.println(inDataStream.readChar());
		System.out.println(inDataStream.readBoolean());
		inDataStream.close();
	}
}
