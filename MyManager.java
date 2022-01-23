
public class MyManager extends MyEmployee {
	private double salary;
	public String calSalary(int managerType) {
		if (managerType == 1) salary = 30000;
		else if (managerType == 2) salary = 35000;
		else if (managerType == 3) salary = 50000;
		return "Salary : " + salary;
	}
	public String getFirstEmpid() {
		return "First Emp Id : 8\n";
	}
}
