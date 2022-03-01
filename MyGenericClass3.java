
public class MyGenericClass3<T1, T2, T3> {
 // แสดงการนำ Type parameter มาใช้กับ accessor method 
 // และ mutator method
 // นำ type parameter T1 มากำหนดเป็นชนิดข้อมูลให้กับแอตทริบิวต์ firstVar
  private T1 firstVar;
  // นำ type parameter T2 มากำหนดเป็นชนิดข้อมูลให้กับแอตทริบิวต์ secondVar
  private T2 secondVar;
  // นำ type parameter T3 มากำหนดเป็นชนิดข้อมูลให้กับแอตทริบิวต์ thirdVar
  private T3 thirdVar;
  
  public MyGenericClass3() {
	  firstVar = null;
	  secondVar = null;
	  thirdVar = null;
  }
  // เมธอด setFirstVar รับพารามิเตอร์ชนิดข้อมูล T1 ผ่านมาทางตัวแปร theFirst
  public void setFirstVar(T1 theFirst) {
	  firstVar = theFirst;
  }
  // เมธอด setSecondVar รับพารามิตเตอร์ชนิดข้อมูล T2 ผ่านตัวแปร theSecond
  public void setSecondVar(T2 theSecond) {
	  secondVar = theSecond;
  }
  // เมธอด setThirdVar รับพารามิเตอร์ชนิดข้อมูล T3 ผ่านตัวแปร theThird
  public void setThirdVar(T3 theThird) {
	  thirdVar = theThird;
  }
  // Accessor method
  // นำ type parameter T1, T2, T3 มากำหนดลงในส่วนของ ชนิดของข้อมูลที่จะส่งกลับออกไป
  public T1 getFirstVar() {
	  return firstVar;
  }
  public T2 getSecondVar() {
	  return secondVar;
  }
  public T3 getThirdVar() {
	  return thirdVar;
  }
  public static void main(String[] args) {
	  MyGenericClass3<Integer, Integer, String> gc = 
			  new MyGenericClass3<Integer, Integer, String>();
	  gc.setFirstVar(1);
	  gc.setSecondVar(2);
	  gc.setThirdVar("Three");
	  System.out.println(gc.getFirstVar());
	  System.out.println(gc.getSecondVar());
	  System.out.println(gc.getThirdVar());
  }
}
