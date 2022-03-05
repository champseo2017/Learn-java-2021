
public class TestConvertNumToInt2<N extends Number> {
  // แสดงโปรแกรมที่จำกัดขอบเขตของ Type parameter
  public int convert(N n) {
	  int i;
	  i = n.intValue();
	  return i;
  }
  public static void main(String args[]) {
	  TestConvertNumToInt2<String> numToInt = 
			  new TestConvertNumToInt2<String>();
	  int myValue = numToInt.convert(3.5);
	  System.out.println(myValue);
  }
  // โปรแกรมคอมไฟล์ไม่ผ่าน เนื่องจากขอบเขตของชนิดข้อมูลที่จะนำมากกำหนดให้กับ Type parameter
  // ว่าต้องเป็นคลาส Number หรือ คลาสที่สืบทอดคุณสมบัติมาจากคลาส Number เท่านัน แต่ชนิดข้อมูล
  // String ที่นำมากำหนดให้กับ Type parameter N เป็นคลาสที่ไม่ได้สืบทอดคุณสมบัติมากจากคลาส 
  // Number
}
