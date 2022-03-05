
public class TestConvertNumToInt2<N extends Number> {
  // แสดงโปรแกรมที่จำกัดขอบเขตของ Type parameter
  public int convert(N n) {
	  int i;
	  i = n.intValue();
	  return i;
  }
  public static void main(String args[]) {
	  TestConvertNumToInt2<Double> numToInt = 
			  new TestConvertNumToInt2<Double>();
	  int myValue = numToInt.convert(3.5);
	  System.out.println(myValue);
  }
  // การระบุ N extends Number คือ การจำกัดขอบเขตของชนิดข้อมูลที่จะนำมากำหนดให้กับ
  // Type parameter N โดยชนิดข้อมูลที่จะนำมากำหนดให้กับ Type parameter N ต้องเป็น
  // ชนิดข้อมูลของคลาสที่สืบทอดคุณสมบัติมาจากคลาส Number หรือเป็นตัวคลาส Number เองเท่านั้น
}
