
public class TestThread extends Thread {
	public static void main(String[] args) {
		TestThread t = new TestThread();
		t.start();
	}
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(getName() + " running now");
		}
	}
}
