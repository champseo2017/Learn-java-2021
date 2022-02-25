import java.io.*;
public class ObjectDJ {
	public static void main(String args[]) {
		DJ dj_in = new DJ("DJ.NooMan", "106.5", 30000.00);
		FileOutputStream fout = null;
		ObjectOutputStream oout = null;
		FileInputStream fin = null;
		ObjectInputStream oin = null;
		try {
			fout = new FileOutputStream("data.txt");
			oout = new ObjectOutputStream(fout);
			// เรียกเมธอด writeObject เพื่อเขียนข้อมูลที่เป็นออบเจ็คซึ่งประกอบด้วย
			// ค่า DJ.NooMan, 106.5 และ 30000.00 ลงในไฟล์ data.txt
			oout.writeObject(dj_in); // เขียนข้อมูลเป็นออบเจ็คลงในไฟล์ data.txt
			System.out.println("Successful to write object into file");
			fin = new FileInputStream("data.txt");
			oin = new ObjectInputStream(fin);
			// เรียกเมธอด readObject เพื่ออ่านข้อมูลที่เป็นออบเจ็คจากไฟล์ data.txt
			// เก็บลงในตัวแปร dj_out โดยในที่นี้ต้องทำการ casting ข้อมูลที่อ่านได้ให้มีชนิดข้อมูล
			// เป็น DJ ด้วย
			DJ dj_out = (DJ) oin.readObject();
			System.out.println(dj_out.name);
			System.out.println(dj_out.station);
			System.out.println(dj_out.getSalary());
		} catch (ClassNotFoundException e1) {
			System.out.println(e1.getMessage());
		} catch (IOException e2) {
			System.out.println(e2.getMessage());
		} finally {
			try {
				if (oout != null) oout.close();
				if (fout != null) fout.close();
				if (oin != null) oin.close();
				if (fin != null) fin.close();
			} catch (IOException e3) {
				System.out.println(e3.getMessage());
			}
		}
	}
}
