import data.Promotion;
public class IceCreamPromotion {
	public static void main(String [] args) {
		int myMonth;
		String myPromotion;
		
		Promotion promotion = new Promotion();
		myMonth = promotion.getMonth();
		myPromotion = promotion.getPromotion();
		
		System.out.println("Promotion in this month [ " 
		+ promotion.monthString(myMonth) + " ]");
		
		System.out.println("\t" + myPromotion);
		promotion.setMonth(13);
		promotion.setMonth(12);
		promotion.setPromotion("Buy 1 cup of Banana Split, Free Ice Tea");
		myMonth = promotion.getMonth();
		myPromotion = promotion.getPromotion();
		System.out.println("Promotion in this month [ " 
		+ promotion.monthString(myMonth) + " ]");
		System.out.println("\t" + myPromotion);
	}
}
