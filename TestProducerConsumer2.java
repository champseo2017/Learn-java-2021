
class DataValue2 {
	char alphabetic;
	/* ถ้า flagWrite เป็น true จะทำให้เธรด Producer เขียนข้อมูลได้ แต่เธรด Consumner
	 * อ่านข้อมูลไม่ได้ แต่ถ้า flagWrite เป็น false จะทำให้เธรด Producer ไม่สามารถเขียน
	 * ข้อมูลได้ แต่เธรด Consumner สามารถอ่านข้อมูลได้
	 * */
	boolean flagWrite = true;
	synchronized void write(char ch) {
		if (flagWrite == false) {
			try {
				// ถ้า flagWrite เป็น false แล้วต้องเรียกเมธอด wait เพื่อรอคอยการเขียนข้อมูล
				wait();
			} catch (InterruptedException e1) {
				System.out.println("Write : "
						+ "Exception occur with wait method");
			}
		}
		System.out.println("Producer write : " + ch);
		alphabetic = ch;
		flagWrite = false;
		notify();
	}
	synchronized char read() {
		if (flagWrite == true) {
			try {
				// ถ้า flagWrite เป็น true แสดงว่าเธรด Producer กำลังเขียนข้อมูลอยู่
				// ดังนั้นต้องเรียกเมธอด wait เพื่อรอคอยจนกว่าเธรด Producer จะประมวลผลเสร็จ
				wait();
			} catch (InterruptedException e2) {
				System.out.println("Read : Exception occur "
						+ "with wait method");
			}
		}
		System.out.println("Consumer read : " + alphabetic);
		// อ่านข้อมูลเสร็จแล้วเซต flagWrite กลับไปเป็น true เพื่อให้เธรด Producer สามารถ
		// เขียนข้อมูลได้
		flagWrite = true;
		// เรียกเมธอด notify เพื่อให้เธรด Producer ที่รอคอยเขียนข้อมูล ตื่นขึ้นมาทำงาน
		notify();
		return alphabetic;
	}
}

class Producer2 extends Thread {
	DataValue2 val;
	Producer2(DataValue2 param_val) {
		val = param_val;
	}
	public void run() {
		for (int i = 0; i < 5; i++) {
			int rand = (int) (Math.random() * 25);
			char ch[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
					'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
					'w', 'x', 'x', 'y', 'z'};
			val.write(ch[rand]);
		}
	}
}

class Consumer2 extends Thread {
	DataValue2 val;
	Consumer2(DataValue2 param_val) {
		val = param_val;
	}
	public void run() {
		for (int i = 0; i < 5; i++) {
			val.read();
		}
	}
}

public class TestProducerConsumer2 {
	/* 
	 * wait เพื่อสั่งให้เธรด Producer หยุดการทำงานชั่วขณะในขณะที่เทรด Consumer กำลังอ่าน
	 * ข้อมูล หรือสั่งให้เธรด Consumer หยุดการทำงานชั่วขณะในขณะที่เทรด Producer กำลังเขียนข้อมูล
	 * เมธอด notify ใช้เพื่อระบุว่าเมื่อเธรด Producer เขียนข้อมูลเสร็จ ควรจะสั่ง notify เพื่อระบุให้เธรด
	 * Consumer อ่านข้อมูลได้ หรือเมื่อเธรด Consumer อ่านข้อมูลเสร็จ ควรจะสั่ง notify เพื่อระบุให้เธรด
	 * Producer เขียนข้อมูลได้
	 * */
	public static void main(String args[]) throws Exception {
		DataValue2 val = new DataValue2();
		Producer2 p = new Producer2(val);
		Consumer2 c = new Consumer2(val);
		p.start();
		c.start();
	}
}
