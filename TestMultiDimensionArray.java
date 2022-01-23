
public class TestMultiDimensionArray {
	public static void main(String[] args) {
		// สร้างอาร์เรย์ number เป็นอาร์เรย์ 2 มิติขนาด 10 แถว
		int number[][] = new int[10][];
		int count = 1; // ใช้ตัวแปร count เก็บจำนวนคอลัมน์ที่จะสร้างในแต่ละแถว
		int num = 1; // ใช้ตัวแปร num เก็บค่าที่จะกำหนดให้แต่ละช่องของอาร์เรย์
		for (int i = 0; i < 10; i++) {
			number[i] = new int[count++];
			for (int j = 0; j <= i; j++) { // ลูปนี้สำหรับการทำงานกับคอลัมน์ของอาร์เรย์
				number[i][j] = num++;
				System.out.print(number[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
