
public class MyGeneriClass1<M> {
	public MyGeneriClass1() {
		System.out.println("I love you");
	}
	public MyGeneriClass1(M param_message) {
		System.out.println("I love " + param_message);
	}
	public static void main(String[] args) {
		MyGeneriClass1<String> gc1 = 
				new MyGeneriClass1<String>();
		MyGeneriClass1<String> gc2 = 
				new MyGeneriClass1<String>("Thailand");
	}
}
/* 
 * กรณีนี้คอนสตรัคเตอร์ของคลาสนำ Type parameter M มากำหนดเป็นชนิดข้อมูล
 * ให้กับตัวแปร param_message ดังนั้นหากสร้างออบเจ็คของคลาสโดยระบุเป็น
 * MyGenericClass<String> gc2 = new MyGenericClass1<String>
 * ("Thailand"); จะหมายถึง Type argument มีชนิดข้อมูลเป็น String จึงทำให้
 * Type Parameter M ถูกแทนที่ด้วยชนิดข้อมูล String ดังนั้นจึงทำให้ตัวแปร
 * param_message มีชนิดข้อมูลเป็น String
 * 
 * */