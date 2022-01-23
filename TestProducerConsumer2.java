
class DataValue2 {
	char alphabetic;
	/* ถ้า flagWrite เป็น true จะทำให้เธรด Producer เขียนข้อมูลได้ แต่เธรด Consumner
	 * อ่านข้อมูลไม่ได้ แต่ถ้า flagWrite เป็น false จะทำให้เธรด Producer ไม่สามารถเขียน
	 * ข้อมูลได้ แต่เธรด Consumner สามารถอ่านข้อมูลได้
	 * */
}



public class TestProducerConsumer2 {
	/* 
	 * wait เพื่อสั่งให้เธรด Producer หยุดการทำงานชั่วขณะในขณะที่เทรด Consumer กำลังอ่าน
	 * ข้อมูล หรือสั่งให้เธรด Consumer หยุดการทำงานชั่วขณะในขณะที่เทรด Producer กำลังเขียนข้อมูล
	 * เมธอด notify ใช้เพื่อระบุว่าเมื่อเธรด Producer เขียนข้อมูลเสร็จ ควรจะสั่ง notify เพื่อระบุให้เธรด
	 * Consumer อ่านข้อมูลได้ หรือเมื่อเธรด Consumer อ่านข้อมูลเสร็จ ควรจะสั่ง notify เพื่อระบุให้เธรด
	 * Producer เขียนข้อมูลได้
	 * */
}
