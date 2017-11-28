package inheritance.classes;

public class Employee extends Person{
	private int empid;
	private String dept;
	
	public Employee() {
	super();
		System.out.println("Constructor::Employee()");
	}
	
	public Employee(int empid,String dept){
		System.out.println("Constructor::Employee(int,str)");
		this.empid=empid;
		this.dept=dept;
	}
	
}
