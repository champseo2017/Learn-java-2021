
public class TestJoin extends Thread {
	TestJoin(String province) {
		super(province);
	}
	
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.print(getName() + " ");
		}
	}
	public static void main(String[] args) {
		TestJoin j1 = new TestJoin("Bangkok");
		TestJoin j2 = new TestJoin("Krabi");
		TestJoin j3 = new TestJoin("Chiangmai");
		try {
			j1.start();
			j1.join();
			j2.start();
			j3.start();
		} catch (InterruptedException ignore) {
			System.out.println("Exception");
		}
	}
}
