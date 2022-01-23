
public class AlphabeticCharacter {
	public static void main(String[] args) {
		char[] s;
		s = new char[26]; // สร้างอาร์เรย์ชนิดข้อมูลตัวอักษรขนาด 26 ช่อง
		for (int i = 0; i < s.length; i++) { // s.length ใช้หาขนาดของอาร์เรย์ s
			s[i] = (char) ('A' + i); // กำหนดค่าตัวอักษรให้แต่ละช่องของอาร์เรย์ s
		}
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + "\t"); // พิมพ์ค่าของอาร์เรย์ออกมาทีละช่อง
		}
	}
}
