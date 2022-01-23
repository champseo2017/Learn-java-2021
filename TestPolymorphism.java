
public class TestPolymorphism {
	String name, dept;
	int empId;
	double salary;

	public TestPolymorphism(String name, int empId, double salary) {
		this.name = name;
		this.empId = empId;
		this.salary = salary;
		this.dept = "N/A";
	}

	public TestPolymorphism(String name, int empId, double salary, String dept) {
		this.name = name;
		this.empId = empId;
		this.salary = salary;
		this.dept = dept;
	}

	public void printData() {
		System.out.println("Name : " + name);
		System.out.println("EmpId : " + empId);
		System.out.println("Salary : " + salary);
		System.out.println("Department : " + dept);
	}

	public static void main(String[] args) {
		TestPolymorphism tp;
		if (args.length < 3 || args.length > 4) {
			System.out.println("Please input data");
			System.out.println("For employee => name empId salary");
			System.out.println("For manager => name empId salary");
		} else if (args.length == 3) {
			tp = new TestPolymorphism(args[0], Integer.parseInt(args[1]), Double.parseDouble(args[2]));
			tp.printData();
		} else if (args.length == 4) {
			tp = new TestPolymorphism
					(args[0], Integer.parseInt(args[1]), 
			Double.parseDouble(args[2]), args[3]);
			tp.printData();
		}
	}
}
