
public class TestSleep extends Thread {
	public TestSleep(String threadName) {
		super(threadName);
	}
	public static void main(String[] args) {
		TestSleep t = new TestSleep("MyThread");
		System.out.println(t.getState());
		t.start();
		Thread.State s;
		do {
			s = t.getState();
			System.out.println(s);
		} while (s != Thread.State.TERMINATED);
	}
	
	public void run() {
		System.out.println(getName() + " running now");
		System.out.println(getName() + " sleep now");
		try {
			sleep(3);
		} catch (InterruptedException e) {}
	}
}
