package Question_2;

import java.util.Comparator;

public class EmpSalaryComp implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		
		if(emp1.getSalary()>emp2.getSalary()) {
			return 1;
		}
		else if(emp2.getSalary()<emp2.getSalary()) {
			return -1;
		}
		
		else return emp1.getEmpName().compareTo(emp2.getEmpName());
	}
	


}
