
public class TestConvertString {
	public static void main(String[] args) {
		String word = "Java Programming Language";
		String s1 = "123", s2 = "350 Baht.";
		System.out.println("\"" + word + "\", toUpperCase = \"" 
		+ word.toUpperCase() + "\"");
		System.out.println("\"" + word + "\", toUpperCase = \"" 
				+ word.toLowerCase() + "\"");
		System.out.println("Convert String\"" + s1 + "\" to int "
				+ Integer.parseInt(s1));
		System.out.println("Convert String\"" + s2 + "\" to double "
				+ Double.parseDouble(s2.substring(0, 3)));
	}
}
