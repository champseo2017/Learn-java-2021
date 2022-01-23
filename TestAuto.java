
public class TestAuto {
	public static void main(String[] args) {
		byte a = 1;
		short b = 2;
		int c = 3;
		long d = 4L;
		float e = 5.0F;
		double f = 6.0;
		char g = 'a';
		boolean h = true;
		// Autoboxing
		Byte aObj = a;
		Short bObj = b;
		Integer cObj = c;
		Long dObj = d;
		Float eObj = e;
		Double fObj = f;
		Character gObj = g;
		Boolean hObj = h;
		// Autounboxing
		byte a1 = aObj;
		short b1 = bObj;
		int c1 = cObj;
		long d1 = dObj;
		float e1 = eObj;
		double f1 = fObj;
		char g1 = gObj;
		boolean h1 = hObj;
		System.out.println(a1 + " " + b1 + " " + c1 + " " + d1 + " " + e1 + " " + f1 + " " + g1 + " " + h1);
	}
}
