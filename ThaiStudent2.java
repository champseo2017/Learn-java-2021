
public class ThaiStudent2 {
	String name;
	int age;
	double grade;
	public ThaiStudent2() {
		grade = 3.06;
		age = 6;
	}
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public void printData() {
		System.out.println("Age : " + age);
		System.out.println("Grade : " + grade);
	}
	public static void main(String[] args) {
		ThaiStudent2 s = new ThaiStudent2();
		s.setName("Noo Nid");
		System.out.println("Name : " + s.getName());
		s.printData();
	}
}
