package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayList<Employee> empList= new ArrayList<Employee>();
		
		empList.add(new Employee(1,"Alex",10_000,new Department(1, "COMPUTER")));
		empList.add(new Employee(2,"Brian",1000,new Department(2, "ENTC")));
		empList.add(new Employee(3,"Christ",4000_000,new Department(1, "COMPUTER")));
		empList.add(new Employee(4,"Dave",6000_000,new Department(3, "MECH")));

		
		Collections.sort(empList);		//default sort of collections class will search for "compareTo" in Employee class and sort based on it
										//drawback with this kindof compareTo method is bean(Employee) has sorting logic embedded.
		
	System.out.println("-----------------------------------");			
	for (Employee employee : empList) {
		System.out.println(employee);
	}


	Collections.shuffle(empList);
	System.out.println("------------------------------------");
	for (Employee employee : empList) {
		System.out.println(employee);
	}
	
	Collections.sort(empList,new SalaryComparator());		//with the Comparator you dont need to care whether the bean has compareTo or not.
															//no need to modify the bean(Employee), we can EXTERNALLY provide comparison logic 
															//compare(obj1, obj2) decides wether two objects need to be sort on what basis.
	
	System.out.println("------------------------------------");
	for (Employee employee : empList) {
		System.out.println(employee);
	}
	
	
	}
}
