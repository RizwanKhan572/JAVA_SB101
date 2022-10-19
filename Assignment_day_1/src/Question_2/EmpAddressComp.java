package Question_2;

import java.util.Comparator;

public class EmpAddressComp implements Comparator<Employee> {
	
	public static void main(String[] args) {
		
		
	}

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return emp1.getAddress().compareTo(emp2.getAddress());
	}

}
