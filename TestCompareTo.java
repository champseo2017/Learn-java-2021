
public class TestCompareTo {
	public static void main(String[] args) {
		String s1 = "abc", s2 = "def", s3 = "abc";
		if (s1.compareTo(s2) < 0) System.out.println("s1 < s2");
		if (s2.compareTo(s3) > 0) System.out.println("s2 > s3");
		if (s3.compareTo(s1) == 0) System.out.println("s3 == s1");
		if (s1.compareTo(s3) > 0) System.out.println("s1 > s3");
	}
}
