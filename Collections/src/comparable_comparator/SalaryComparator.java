package comparable_comparator;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		if(o1.getSalary()==o2.getSalary())
		return 0;
		else if(o1.getSalary()>o2.getSalary())
			return 1000000;
		else return -1;
	}

	

 
}
