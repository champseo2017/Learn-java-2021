
public class Undergraduate implements Form {
	public void apply
	(String name, String surname, String address, int applyid) {
		System.out.println();
		System.out.println("@@@@ Undergraduate Form @@@@");
		System.out.print("ID:" + applyid + ", Name:" + name + "" + surname);
		System.out.println(", Address:" + address);
		System.out.println("Apply Successful!!!");
		System.out.println();
	}
	public void resign(int id) {};
}
