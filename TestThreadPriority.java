
public class TestThreadPriority extends Thread {
	public TestThreadPriority(String threadName) {
		super(threadName);
	}
	public static void main(String[] args) {
		Thread t1 = new TestThreadPriority("A");
		Thread t2 = new TestThreadPriority("B");
		 t1.setPriority(1);
		 t2.setPriority(10);
		t1.start();
		t2.start();
	}
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.print(getName());
		}
	}
}
