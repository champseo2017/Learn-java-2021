
public class TestThis {
	private String name = "TestThis";
	public TestThis(String name) {
		//this.name = name;
		name = name;
	}
	public void print() {
		System.out.println(name);
	}
	public static void main(String[] args) {
		TestThis t = new TestThis("Champ");
		t.print();
	}
}
