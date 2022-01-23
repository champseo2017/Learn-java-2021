import data.Data;
class TestParameter {
	public void changePrimitive(int num2) {
		num2 = 10;
	}
	public void changeObjectRef(Data d) {
		d = new Data(20);
	}
	public void changeObjectAttr(Data d) {
		d.setNum(30);
	}
	public static void main(String[] args) {
		int num = 2547;
		Data data = new Data(100);
		TestParameter testParam = new TestParameter();
		System.out.print("Before Call changePrimitive method => ");
		System.out.println(num);
		System.out.print("After Call changePrimitive method => ");
		testParam.changePrimitive(num);
		System.out.println(num);
		System.out.print("Before Call changeObjectRef method => ");
		System.out.println(data.myNumber);
		System.out.print("After Call changeObjectRef method => ");
		testParam.changeObjectRef(data);
		System.out.println(data.myNumber);
		
		
		System.out.print("Before Call changeObjectAttr method => ");
		System.out.println(data.myNumber);
		System.out.print("After Call changeObjectAttr method => ");
		testParam.changeObjectAttr(data);
		System.out.println(data.myNumber);
		
		/* 
		 Accessor Method
		 public String getName() {
		 
		 }
		 
		 Mutator Method
		 public void setName(String name) {
		   this.name = name;
		 }
		  */
	}
}
