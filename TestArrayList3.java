import java.util.ArrayList;
public class TestArrayList3 {
	public static void main(String[] args) {
		ArrayList<Character> arrList = new ArrayList<Character>();
		arrList.add('s');
		arrList.add('h');
		arrList.add('a');
		arrList.add('r');
		arrList.add('e');
		System.out.println(arrList);
		arrList.remove(0);
		System.out.println(arrList);
		Character removeH = 'h';
		arrList.remove(removeH);
		System.out.println(arrList);
	}
}
