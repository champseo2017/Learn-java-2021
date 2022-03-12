import java.util.*;
public class TestLowerBound {
	// แสดง Bounded wildcard ที่เป็น Lower bound
	// Lower bound คือ การจำกัดขอบเขตของ wildcard ด้วยคีย์เวิร์ด super 
	// เช่น ArrayList<? super Number> หมายถึง ชนิดข้อมูลที่จะนำมาแทนที่ลงใน <?>
	// ต้องเป็นชนิดข้อมูลของคลาสแม่ (superclass) ของคลาส Number หรือ เป็นตัวคลาส Number
	// เอง
	public static void main(String[] args) {
		ArrayList <? super Integer> al;
		al = new ArrayList<Number>();
		al.add(10);
		al.add(10 * 2);
		for (Object num:al) {
			System.out.println(num);
		}
	}
	// ประกาศ ArrayList <? super Integer> al;
	// หมายถึงจำกัดขอบเขตข้อมูลที่จะใช้ใน Type Paramter ว่าต้องเป็นชนิดข้อมูลของคลาสแม่
	// (superclass) ของคลาส Integer หรือเป็นชนิดข้อมูล Integer เองเท่านั้น
	// คลาส Number เป็นคลาสแม่ของคลาส Integer
}
