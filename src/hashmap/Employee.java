package hashmap;

public class Employee {
	int roll;
	String name;
	String address;
	public Employee() {
		super();
	}
	public Employee(int roll, String name, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
}
