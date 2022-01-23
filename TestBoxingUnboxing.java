
public class TestBoxingUnboxing {
	public static void main(String[] args) {
		byte a = 1;
		short b = 2;
		int c = 3;
		long d = 4L;
		float e = 5.0F;
		double f = 6.0;
		char g = 'a';
		boolean h = true;
		Byte aObj = new Byte(a);
		Short bObj = new Short(b);
		Integer cObj = new Integer(c);
		Long dObj = new Long(d);
		Float eObj = new Float(e);
		Double fObj = new Double(f);
		Character gObj = new Character(g);
		Boolean hObj = new Boolean(h);

		byte aUnBox = aObj.byteValue();
		short bUnbox = bObj.shortValue();
		int cUnbox = cObj.intValue();
		long dUnbox = dObj.longValue();
		float eUnbox = eObj.floatValue();
		double fUnbox = fObj.doubleValue();
		char gUnbox = gObj.charValue();
		boolean hUnbox = hObj.booleanValue();

		System.out.println(aUnBox + " " + bUnbox + " " + cUnbox + " " + dUnbox + " " + eUnbox + " " + fUnbox + " " + gUnbox
				+ " " + hUnbox);
	}
}
