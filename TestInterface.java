import java.io.*;
public class TestInterface {
	public static int undergraduateId;
	public static int officerId;
	public static int input;
	public static String inputStr;
	InputStreamReader ir = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(ir);
	
	public static void main(String[] args) {
		TestInterface tif = new TestInterface();
		Undergraduate u = new Undergraduate();
		Officer o = new Officer();
		do {
			do {
				input = tif.inputData();
			} while (input == 1000);
			
			if (input == 1) {
				++undergraduateId;
				u.apply(tif.getName(), tif.getSurname(), tif.getAddress(), 
				undergraduateId);
			} else if (input == 2) {
				++officerId;
				o.apply(tif.getName(), tif.getSurname(), tif.getAddress(), 
				officerId);
			} else if (input <= 0 || input > 3) {
				System.out.println("Please select 1-3 only");
			} 
		} while (input != 3);
	}
	
	public int inputData() {
		System.out.println("#################");
		System.out.println("#   Application Form  #");
		System.out.println("#################");
		System.out.println("# 1 Apply for Undergraduate #");
		System.out.println("# 2 Apply for Officer #");
		System.out.println("# 3 Exit #");
		System.out.println("####################");
		try {
			System.out.print("select : ");
			input = Integer.parseInt(in.readLine());
		} catch (IOException e) {
			System.out.println("Read input keyboard error");
			input = 1000;
		} catch (NumberFormatException e2) {
			System.out.println("input wrong");
			input = 1000;
		}
		return input;
	}
	public String getName() {
		System.out.print("Name : ");
		try {
			inputStr = in.readLine();
		} catch (IOException e) {
			System.out.println("Read name error");
			input = 1000;
		}
		return inputStr;
	}
	
	public String getSurname() {
		System.out.print("Surname : ");
		try {
			inputStr = in.readLine();
		} catch(IOException e) {
			System.out.println("Read surname error");
			input = 1000;
		}
		return inputStr;
	}
	public String getAddress() {
		System.out.print("Address : ");
		try {
			inputStr = in.readLine();
		} catch (IOException e) {
			System.out.println("Read address error");
			input = 1000;
		}
		return inputStr;
	}
}
