package Question_2;

import java.util.Comparator;
public class EmpIdComp implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return emp1.getEmpId()>emp2.getEmpId() ? +1 : -1;
	}

	
	

	
}
