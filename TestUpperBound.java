import java.util.*;
public class TestUpperBound {
	// Upper bound คือ การจำกัดขอบเขตของ wildcard ด้วยคีย์เวิร์ด extends
	// ตัวอย่างเช่น ArrayList<? extends Number> หมายถึง ชนิดข้อมูลที่จะนำมาแทน
	// ที่ลงใน <?> ต้องเป็นชนิดข้อมูลของคลาสที่สืบทอดคุณสมบบัติมาจากคลาส Number หรือ
	// เป็นตัวคลาส Number เอง
	public static void main(String[] args) {
		Box<? extends Money> m = 
				new Box<Money>(50.5);
		Box<? extends Money> b = 
				new Box<Banknote>(50);
		Box<? extends Money> c =
				new Box<Coin>(0.50F);
	}
}

class Box<E> { // คลาสของกล่อง
	Box(double money) {
		// เรียกเมธอด printMoney ของคลาส Money ให้ทำงาน
		Money.printMoney(money);
	}
	Box(int banknote) {
		// เรียกเมธอด printBanknote ของคลาส Banknote ให้ทำงาน
		Banknote.printBanknote(banknote);
	}
	Box(float coin) {
		// เรียกเมธอด printCoin ของคลาส Coin ให้ทำงาน
		Coin.printCoin(coin);
	}
}

class Money { // คลาสของเงินเป็นได้ทั้งธนบัตรและเหรียญ
	static void printMoney(double money) {
		System.out.println("Total money " + money + " baht");
	}
}

class Banknote extends Money { // คลาสของธนบัตร
	static void printBanknote(int banknote) {
		System.out.println("Total banknote " + banknote + " bath");
	}
}

class Coin extends Money { // คลาสของเหรียญ
	static void printCoin(float coin) {
		System.out.println("Total coin " + coin + " bath");
	}
}

// Box<? extends Money> ต้องเป็นคลาส Money หรือ คลาสลูกของคลาส Money
// Box<? extends Money> b = new Box<Banknote>(50); เป็นคลาสลูกของ Money