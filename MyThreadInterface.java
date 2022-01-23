
class TestThreadInterface implements Runnable {
	public void run() {
		int i = 0;
		while (true) {
			System.out.println("Thrad running round " + ++i);
			if (i == 3) break;
		}
	}
}

public class MyThreadInterface {
	public static void main(String[] args) {
		TestThreadInterface test = new TestThreadInterface();
		Thread t = new Thread(test);
		t.start();
	}
}
