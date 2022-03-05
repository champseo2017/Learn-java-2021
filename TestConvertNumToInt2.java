
public class TestConvertNumToInt2<N extends Number> {
  // แสดงโปรแกรมที่จำกัดขอบเขตของ Type parameter
  public int convert(N n) {
	  int i;
	  i = n.intValue();
	  return i;
  }
  public static void main(String args[]) {
	  TestConvertNumToInt2<Number> numToInt = 
			  new TestConvertNumToInt2<Number>();
	  int myValue = numToInt.convert(3.5);
	  System.out.println(myValue);
  }
  // จะพบว่า Type argument คือ Class type ชื่อคลาส Number ซึ้งเราสามารถนำคลาสนี้มากำหนด
  // ให้กับ Type parameter N ได้ เพราะเรากำหนดคำสั่งเป็น N extends Number ซึ้งคลาส Number
  // ถือว่าอยู่ภายในขอบเขตที่ได้กำหนดขึ้น
}
