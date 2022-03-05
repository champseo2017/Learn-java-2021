
public class TestConvertNumToInt<N> {
   // Bounded type parameter
	// คือการจำกัดขอบเขตของ Type parameter ว่าชนิดข้อมูลที่จะนำมากำหนดให้กับ Type parameter
	// เป็นชนิดข้อมูลประเภทใดได้บ้าง
	// แสดงโปรแกรมที่ไม่ได้จำกัดขอบเขตของ Type parameter
	public int convert(N n) {
		int i;
		i = n.intValue();
		return i;
	}
	public static void main(String args[]) {
		TestConvertNumToInt<Double> numToInt = 
				new TestConvertNumToInt<Double>();
		int myValue = numToInt.convert(3.5);
		System.out.println(myValue);
	}
}
