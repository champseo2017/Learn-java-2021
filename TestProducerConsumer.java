
class DataValue {
	// ตัวแปร alphabetic เป็นตัวแปรของคลาส ซึ้งเมธอด write และ read จะใช้ตัวแปรนี้ร่วมกัน
	char alphabetic;
	synchronized void write(char ch) {
		System.out.println("Producer write : " + ch);
		alphabetic = ch;
	}
	/* 
	 * synchronized method ชื่อ read ใช้สำหรับอ่านข้อมูลตัวอักษร a-z ตัวใดตัวหนึ่งที่ เมธอด write
	 * เขียนออกมา นำมาแสดงบนจอภาพ
	 * */
	synchronized char read() {
		System.out.println("Consumer read : " + alphabetic);
		return alphabetic;
	}
}

class Producer extends Thread {
	DataValue val;
	Producer(DataValue param_val) {
		// ระบุให้ตัวแปรออบเจ็ค val อ้างอิงไปยังออบเจ็คเดียวกับ
		// ที่ตัวแปร param_val อ้างอิงอยู่
		val = param_val;
	}
	public void run() {
		for (int i = 0; i < 5; i++) { // วนลูป 5 ครั้งเพื่อเขียนข้อมูล
			// สุ่มค่าตัวเลขระหว่าง 0-25 ออกมา 1 ค่า แล้วเก็บลงตัวแปร rand
			int rand = (int) (Math.random() * 26);
			char ch[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
					'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
					'w', 'x', 'x', 'y', 'z'};
			/* เมื่อได้ค่าที่สุ่มได้เก็บลงตัวแปร rand แล้วก็นำค่านั้นมาเป็น index เพื่อใช้ดึงตัวอักษรจากอาร์เรย์ ch 
			 * ออกมา
			 * 
			 * */
			val.write(ch[rand]);
		}
	}
}

class Consumer extends Thread {
	DataValue val;
	Consumer(DataValue param_val) {
		val = param_val;
	}
	public void run() {
		for (int i = 0; i < 5; i++) {
			val.read();
		}
	}
}

class TestProducerConsumer {
	public static void main(String args[]) throws Exception {
		/* สร้างตัวแปรออเจ็กต์ของคลาส DataValue และนำตัวแปรออเจ็ค val อ้างอิงมายัง
		 * ออเจ็คที่สร้างขึ้น 
		 * */
		DataValue val = new DataValue();
		Producer p = new Producer(val);
		Consumer c = new Consumer(val);
		p.start();
		c.start();
	}
}