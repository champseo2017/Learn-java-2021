import java.util.ArrayList;
public class IntArrayListGeneric {
	// แสดงการเขียนโปรแกรมโดยใช้ Generic
	public static void main(String[] args) {
		// บรรทัดข่างล่างนี้แสดงการนำ Generic มาใช้
		ArrayList<Double> myIntList = new ArrayList<Double>();
		myIntList.add(10.0);
		// เมื่อใช้ Generic แล้วไม่ต้องทำ casting เพราะถ้าเราทำงานกับชนิดข้อมูลผิดประเภท
		// คอมไฟเลอร์ก็จะแจ้งข้อผิพพลาดให้ทราบเองขณะคอมไฟล์โปรแกรม
		Double myInt = myIntList.get(0);
		System.out.println(myInt);
	}
}

/* 
 * สรุปว่า Generic ก็คือตัวที่จะนำมาช่วยตรวจสอบการทำงานของชนิดข้อมูลนั่นเอง
 * หากทำงานกับชนิดข้อมูลผิดประเภทคอมไฟเลอร์ก็จะตรวจสอบพบข้อผิดพลาดนั่้นได้ในขณะสั่งคอมไฟล์โปรแกรม
 * */
