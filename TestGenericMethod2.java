
public class TestGenericMethod2 {
 // แสดงการทำงานของ Generic method กับคลาสปกติที่ไม่ใช่ Generic class
 // เมธอด MyGenericMethod2 สร้าง Type parameter ขึ้นมา 2 ตัว คือ A และ B
 // จะพบว่าหาก Genenic method ประกอบด้วย Type paramter มากกว่า 1 ตัว
 // เราจะแยก Type parameter แต่ละตัวออกจากกันด้วยเครื่องหมายคอมม่า
 public <A, B> void myGenericMethod2(A num1, B num2) {
	 System.out.println("Number 1 is " + num1);
	 System.out.println("Number 2 is " + num2);
 }
 public static void main(String[] args) {
	 TestGenericMethod2 gm = new TestGenericMethod2();
	 gm.<Integer, Integer>myGenericMethod2(11, 22);
 }
}
