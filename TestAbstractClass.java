
public class TestAbstractClass {
	public static void main(String[] args) {
		MyHourlyEmployee h = new MyHourlyEmployee();
		MyGeneralEmployee e = new MyGeneralEmployee();
		MyManager m = new MyManager();
		System.out.println("Hourly Employee");
		System.out.println(h.calSalary(180));
		System.out.println(h.getFirstEmpid());
		System.out.println("Employee");
		System.out.println(e.calSalary(113));
		System.out.println(e.getFirstEmpid());
		System.out.println("Manager");
		System.out.println(m.calSalary(3));
		System.out.println(m.getFirstEmpid());
	}
}
