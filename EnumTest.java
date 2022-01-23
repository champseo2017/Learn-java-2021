
public class EnumTest {
	enum Flavor {
		CHOCOLATE, STRAWBERRY, BLUEBERRY, VANILLA
	};
	public static void main(String[] args) {
		Flavor favoriteFlavor = Flavor.CHOCOLATE;
		System.out.println("I like " + favoriteFlavor + " flavor.");
	}
}
