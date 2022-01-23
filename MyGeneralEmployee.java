
public class MyGeneralEmployee extends MyEmployee {
  private double salary;
  public String calSalary(int empId) {
	  if (empId == 111) salary = 10000;
	  else if (empId == 112) salary = 12000;
	  else if (empId == 113) salary = 15000;
	  else salary = 20000;
	  return "Salary : " + salary;
  }
  public String getFirstEmpid() {
	  return "First Emp Id : 1\n";
  }
}
