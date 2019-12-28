
public class Employee {
	int id;
	String name;  //glodal va/instance/pre-defined

	
	public Employee() {
		id = 123;
		name = "hdfsgasd";
	}
	public Employee(int id, String name) { //local variable
		this.id = id;
		this.name = name;
	}
	void display() {
		System.out.println(id+" "+name);
	}
}
