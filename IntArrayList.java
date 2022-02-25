import java.util.ArrayList;
// แสดงการเขียนโปรแกรมโดยไม่ใช้ Generic
public class IntArrayList {
	public static void main(String[] args) {
		ArrayList myIntList = new ArrayList();
		myIntList.add(10.0);
		// เพิ่มข้อมูล 10.0 ซึ้งเป็นข้อมูลชนิด Double ลงใน ArrayList
		// ดึงข้อมูลจาก ArrayList และ casting ข้อมูลไปเป็นข้อมูลชนิด Integer 
		// ซึ้งตรงนี้จะทำให้เกิดข้อผิดพลาดขึ้น เนื่องจากข้อมูลใน ArrayList เป็น Double
		// แต่เมื่อดึงค่าข้อมูลกลับ Casting ข้อมูลเป็น Integer นี่เรียกว่า การทำงานกับชนิดข้อมูล
		// ที่ผิดประเภท
		Integer myInt = (Integer) myIntList.get(0);
		System.out.println(myInt);
	}
}

// จากตัวอย่างด้านบนจะเห็นว่า เราทำงานกับชนิดข้อมูลที่ผิดประเภท คือ ดึงข้อมูลชนิด Double
// มาจาก ArrayList แต่กลับ casting ข้อมูลเป็น Integer ซึ้งกรณีนี้เราไม่ได้นำคุณสมบัติ
// ของ Generic มาใช้ข้อผิดพลาดจึงถูกตรวจสอบไม่พบขณะคอมไฟล์โปรแกรม แต่จะถูกตรวจสอบ
// พบขณะสั่งรันโปรแกรม