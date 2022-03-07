import java.util.*;
public class TestUnboundWildcard {
	// แสดง Unbounded wildcard
	// Unbounded wildcard type หมายถึง การไม่จำกัดขอบเขตของชนิดข้อมูลที่จะนำมากำหนด
	// ลงในส่วนของ Type parameter กล่าวคือ สามารถนำชนิดข้อมูลทุกประเภทมาแทนที่ลงใน <?>
	// เพื่อกำหนดให้กับ Type parameter ได้ ตัวอย่างเช่น ArrayList<?>
	public static void main(String[] args) {
		ArrayList <Character> al1 = new ArrayList<Character>();
		ArrayList<Double> al2 = new ArrayList<Double>();
		
		al1.add('n');
		al1.add('o');
		al1.add('w');
		al2.add(1.0);
		al2.add(2.0);
		al2.add(3.0);
		
		TestUnboundWildcard t = new TestUnboundWildcard();
		t.printReverse(al1);
		t.printReverse(al2);
	}
	
	public void printReverse(ArrayList<?> al) {
		int size = al.size();
		for (int i = size - 1; i >= 0; i--) {
			System.out.print(al.get(i) + " ");
		}
		System.out.println();
	}
	
	// ArrayList al1 เก็บค่าออบเจ็คของตัวอักษร ArrayList al2 เก็บค่าออบเจ็คของจำนวนจริง
	// ชนิด double ถึงแม้ว่าจะเก็บข้อมูลต่างชนิดกันแต่ก็สามารถส่งไปที่ function printReverse ได้
	// เพราะเมธอดนี้รับพารามิเตอร์ ArrayList ประเภทใดก็ได้ทุกประเภทเข้ามาในเมธอด

}
