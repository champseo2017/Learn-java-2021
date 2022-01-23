import java.io.*;

public class TestStaticAttr {
	private static double cost;
	private static int choice;

	public static void main(String[] args) {
		int choice = 0;
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		System.out.println("Item (Sales 10% from total cost)");
		System.out.println("1.Jacket\t 500 Baht.");
		System.out.println("2.Raincoat\t 199 Baht");
		System.out.println("3.Shorts\t 139 Baht.");
		System.out.println("4.Shoe\t\t590 Baht.");
		System.out.println("5.Exit");
		do {
			TestStaticAttr tsa = new TestStaticAttr();
			System.out.print("What do you want to buy ? : ");
			try {
				choice = Integer.parseInt(in.readLine());
				if (choice <= 0 || choice > 5) {
					System.out.println("Wrong Item, please choose 1-5 only");
					System.out.println();
				} else if (choice == 1) {
					tsa.calCost(500);
				} else if (choice == 2) {
					tsa.calCost(199);
				} else if (choice == 3) {
					tsa.calCost(139);
				} else if (choice == 4) {
					tsa.calCost(590);
				}
			} catch (IOException e) {
				System.out.println("Read input keyboard error");
			}
		} while (choice != 5);
		System.out.println("Total cost is " + cost + " Baht.");
		cost = cost - ((cost * 10) / 100);
		System.out.println("Sales 10%, Total cost is " + cost + " Baht.");
	}

	public double calCost(double price) {
		cost = cost + price;
		return cost;
	}
}
