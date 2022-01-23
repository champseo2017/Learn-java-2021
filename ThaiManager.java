
public class ThaiManager extends CompanyEmployee {
	protected String department = "Data Network";

	public String getInformation() {
		return "Name: " + name + "\n" + "Salary: " + salary + "\n" + "Manager of: " + department;
	}

	public static void main(String[] args) {
		CompanyEmployee emp = new CompanyEmployee();
		System.out.println("getInformation method from " + "CompanyEmployee class");
		System.out.println(emp.getInformation());
		ThaiManager mgr = new ThaiManager();
		System.out.println("getInformation method from ThaiManager class");
		System.out.println(mgr.getInformation());
	}
}
