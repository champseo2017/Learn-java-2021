
public class MyHourlyEmployee extends MyEmployee {
	private double salary;
	public String calSalary(int hourOfWork) {
		salary = hourOfWork * 35;
		return "Salary : " + salary;
	}
	public String getFirstEmpid() {
		return "First Emp Id : 9\n";
	}
}
