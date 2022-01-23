
public class CompanyEmployee {
	protected String name = new String("Somsak");
	protected double salary;
	public CompanyEmployee() {
		salary = 20000.00;
	}
	public String getInformation() {
		return "Name: " + name + "\n" + "Salary: " + salary + "\n";
	}
}
