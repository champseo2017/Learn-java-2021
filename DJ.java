// การอ่าน / เขียนข้อมูลที่เป็นออบเจ็ค
// คลาส ObjectInputStream และคลาส ObjectOutputStream เป็นคลาสที่ใช้สำหรับอ่าน
// หรือ เขียนข้อมูลเป็นออบเจ็ค ซึ้งออบเจ็คที่ต้องการอ่านหรือเขียนข้อมูลผ่านทางสตรีมจะต้องเป็นออบเจ็ค
// ของคลาสที่ระบุอิมพลีเมนต์อินเทอร์เฟส Serializable เท่านั้น

// การอิมพลีเมนต์อินเทอร์เฟส Serializable ต้องระบุอิมพอร์ตคลาสจากแพ็กเกจ java.io เสมอ
import java.io.*;
// ในตัวอย่างนี้ต้องการอ่าน / เขียนข้อมูลที่เป็นออบเจ็คของคลาส DJ ดังนั้นจึงต้องระบุ implements 
// Serializable ต่อท้ายคลาสด้วย
public class DJ implements Serializable {
	public String name;
	public String station;
	private transient Double salary;
	// หากไม่ต้องการให้มีการอ่านหรือเขียนข้อมูลของแอตทริบิวต์ salary ผ่านทางสตรีม ก็สามารถระบุ
	// คีย์เวิร์ด transient ให้กับแอตทริบิวต์ salary ได้
	
	DJ(String name, String station, Double salary) {
		this.name = name;
		this.station = station;
		this.salary = salary;
	}
	
	public void setSalary(Double paramSalary) {
		salary = paramSalary;
	}
	
	public Double getSalary() {
		return salary;
	}
}
