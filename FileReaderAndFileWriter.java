import java.io.*;
public class FileReaderAndFileWriter {
	public static void main(String[] args) {
		FileReader in = null;
		FileWriter out = null;
		try {
			/* ถ้าไม่ระบุชื่อ input file และชื่อ output file ผ่านเข้ามาทาง 
			 * command-line argument ก็ให้แสดงวิธีใช้งานโปรแกรมให้ผู้ใช้ทราบ
			 * */
			if (args.length != 2)
				System.out.println("run programe with: java "
						+ "FileReaderAndFileWriter inFile outFile");
				/* FileReader เป็นสตรีมที่ใช้สำหรับอ่านข้อมูลตัวอักษร ส่วน FileWriter
				 * เป็นสตรีมที่ใช้สำหรับเขียนข้อมูลตัวอักษร ทั้ง FileReader และ FileWriter 
				 * สามารถอ่านและเขียนข้อมูลกับ source และ destination ได้โดยตรง
				 * ในที่นี้ทำการอ่านข้อมูลจากชื่อไฟล์ที่ระบุมาใน args[0] (input file) และ เขียนข้อมูล
				 * ลงในไฟล์ที่ระบุมาใน args[1] (output file)
				 * */
				in = new FileReader(args[0]);
				out = new FileWriter(args[1]);
				char buf[] = new char[64];
				/* in.read(buf) หมายถึง อ่านข้อมูลจาก input file มาเก็บลงในอาร์เรย์ buf
				 * และใช้ตัวแปร countRead เก็บจำนวนตัวอักษรที่อ่านได้ (เมธอด read จะคืนค่าเป็น
				 * จำนวนตัวอักษรที่อ่านได้)
				 * */
				int countRead = in.read(buf);
				while (countRead != -1) {
					out.write(buf, 0, countRead);
					countRead = in.read(buf);
				}
		// การทำงานกับไฟล์ต้องดักจับ exception ประเภท IOException เสมอ
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("please input filename");
		} finally {
			try {
				if (in != null) in.close(); // หลังเสร็จการทำงาน ต้องปิดสตรีมด้วย
				if (out != null) out.close(); // หลังเสร็จการทำงาน ต้องปิดสตรีมด้วย
			} catch (IOException e2) {
				System.out.println("Cannot close FileReader and FileWriter");
			}
		}
	}
}
