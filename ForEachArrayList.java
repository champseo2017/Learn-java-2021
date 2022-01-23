import java.util.ArrayList;

public class ForEachArrayList {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>(5);
		al.add("Dog");
		al.add("Cat");
		al.add("Fish");
		al.add("Rabbit");
		al.add("Horse");
		for (String str : al) {
			System.out.print(str + " ");
		}
	}
}
