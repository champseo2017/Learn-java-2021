
public class MultipleThread extends Thread {
	MultipleThread(String province) {
		super(province);
	}
	public void run() {
		for (int i = 0; i < 20; i++)
			System.out.print(getName() + " ");
	}
	public static void main(String[] args) {
		new MultipleThread("Bangkok").start();
		new MultipleThread("Krabi").start();
		new MultipleThread("Chiangmai").start();
	}
}
