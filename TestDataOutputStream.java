import java.io.*;
public class TestDataOutputStream {
	// แสดงการเขียนข้อมูลที่มีชนิดเป็น primitive data type ต่างๆ ลงไฟล์ด้วย
    // คลาส DataOutput 
	// เมื่อรันโปรแกรมไม่สามารถอ่านข้อมูลได้ เนื่องจากคลาส DataOutputStream ทำการเขียนข้อมูล
	// เป็นไบต์นั่นเอง
	public static void main(String[] args) throws IOException {
		File outFile = new File("sampleout7.txt");
		FileOutputStream outFileStream = new FileOutputStream(outFile);
		DataOutputStream outDataStream = 
				new DataOutputStream(outFileStream);
		outDataStream.writeInt(111);
		outDataStream.writeLong(2222L);
		outDataStream.writeFloat(3.3f);
		outDataStream.writeDouble(444.44);
		outDataStream.writeChar('P');
		outDataStream.writeBoolean(false);
		outDataStream.close();
	}
}
