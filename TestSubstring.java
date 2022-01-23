
public class TestSubstring {
	public static void main (String[] args) {
		String myString = "Hello JAVA";
		String myString2 = "Introduction to JAVA programming";
		String myString3 = "I love JAVA";
		String mySubstring;
		mySubstring = myString.substring(6, myString.length());
		System.out.println(mySubstring);
		mySubstring = myString2.substring(16, 20);
		System.out.println(mySubstring);
		mySubstring = myString3.substring(7);
		System.out.println(mySubstring);
	}
}
