package data;
import java.util.Calendar;
public class Promotion {
	Calendar cal = Calendar.getInstance();
	private int month = cal.get(Calendar.MONTH) + 1;
	private String promotion = "Buy 1 Scoop, Free 1 Scoop";
	
	public int getMonth() {
		return this.month;
	}
	
	public void setMonth(int month) {
		if ((month < 0) || (month > 12)) {
			System.out.println("Set month error");
			System.exit(0);
		}
		else
			this.month = month;
	}
	
	public String getPromotion() {
		return this.promotion;
	}
	
	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}
	
	public String monthString(int monthNumber) {
		switch(monthNumber) {
		case 1 : return "January";
		case 2 : return "February";
		case 3 : return "March";
		case 4 : return "April";
		case 5 : return "May";
		case 6 : return "June";
		case 7: return "July";
		case 8: return "August";
		case 9: return "September";
		case 10: return "October";
		case 11: return "November";
		case 12: return "December";
		default: return "Error";
		}
	}
	
}
