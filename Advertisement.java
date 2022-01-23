import data.Banner;
class Advertisement {
	public static void main(String args[]) {
		String adverText;
		
		Banner banner = new Banner();
		adverText = banner.getText();
		System.out.println("Old banner is " + adverText);
		banner.setText("1-9 NOV 2020 : Commart at Queen Sirikit National Convention Center");
		System.out.println("New banner is " + banner.getText());
	}
}
