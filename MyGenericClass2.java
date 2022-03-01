
public class MyGenericClass2<E1, E2> {
 // แสดง Generic class ที่มี Type parameter มากกว่า 1 ตัว
	public MyGenericClass2(E1 param1, E2 param2) {
		System.out.println("I miss " + param1 + "" + param2);
	}
	public static void main(String[] args) {
		MyGenericClass2<Integer, String> gc = 
				new MyGenericClass2<Integer, String>(2, " Of you");
	}
}
