
public class TestEquals {
	public static void main(String[] args) {
		String s1 = "java", s2 = "Java", s3 = "java";
		String str1 = new String("java");
		String str2 = new String("java");
		String str3;
		str3 = str1;
		if (s1.equals(s2)) {
			System.out.println("\"" + s1 + "\" of s1 equals \"" 
		+ s2 + "\" of s2");
		}
		if (s1.equals(s3)) {
			System.out.println("\"" + s1 + "\" of s1 equals \"" 
		+ s3 + "\" of s3");
		}
		if (str1 == str2) {
			System.out.println("str1 == str2");
		}
		if (str1 == str3) {
			System.out.println("str1 == str3");
		}
		if (str1.equals(str2)) {
			System.out.println("str1.equals(str2)");
		}
		if (str1.equals(str3)) {
			System.out.println("str1.equals(str3)");
		}
	}
}
