package comparable_comparator;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private float salary;
	private Department dept;
	
	
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	public Employee(int id, String name, float salary, Department dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	public Employee() {
		this.id = 1;
		this.name = "Dummy";
		this.salary = 00_000;
	}
	
	@Override
	public int compareTo(Employee o) {						//employees compareTo can decide to sort based on any primitive or Class as well
		if(this.dept.getDeptId()>o.dept.getDeptId())		// if it wants to sort on based on any class as dept here, compareTo of Dept will also be checked
			return 1;
		else if(this.dept.getDeptId()<o.dept.getDeptId())
			return -1;
		else
		return 0;
	}
	
	
	//Details about compareTo
	//if it returns any +ve number- current object and targetobject will be swapped  --  > ascending  
	
	//if it returns any -ve number- current object and targetobject wont be swapped	 --  < descending
	
	//if it returns 0- it means that objects are identical
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	
	
	
	

}
