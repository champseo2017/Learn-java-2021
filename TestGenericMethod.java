
public class TestGenericMethod<E> {
	// แสดงการทำงานของ Generic method กับ Generic class
	// ประกาศ Generic method ชื่อ myGenericMethod ขึ้น โดยนำ 
	// Type parameter E มากำหนดเป็นชนิดข้อมูลให้กับตัวแปร myWord 
	// ซึ้งเป็นพารามิเตอร์ที่จะรับเข้ามาภายในเมธอด ด้วย และ ข้อมูลที่จะส่งกลับ
	// ก็ถูกระบุด้วย Type parameter E เช่นกัน
	public <E> E myGenericMethod(E myWorld) {
		return myWorld;
	}
	public static void main(String[] args) {
		// TestGenericMethod<String>(); ก็จะทำให้ Type parameter E
		// มีชนิดข้อมูลเป็น String 
		// Generic method จะรับพารามิเตอร์เป็น สตริงเข้ามา และ จะคืนค่าสตริงกลับออกไปจากเมธอด
		// นั่นเอง
		TestGenericMethod<String> gm = 
				new TestGenericMethod<String>();
		String myWord = gm.<String>myGenericMethod("Hello JAVA");
		System.out.println(myWord);
		
	}
}
