package Question_2;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {
	
	public static void main(String[] args) {
		EmpIdComp id = new EmpIdComp();
		EmpAddressComp add = new EmpAddressComp();
		EmpSalaryComp salary= new EmpSalaryComp();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for sorting");
		  int num= sc.nextInt();
		  if(num==1) {
			  TreeSet<Employee> employees = new TreeSet<>(id);
			  employees.add(new Employee(1,"rizwan","mumbai",5000));
				employees.add(new Employee(2,"ravi","chennai",5000));
				employees.add(new Employee(4,"hemant","goa",6000));
				employees.add(new Employee(10,"pradum","kolkata",3000));
				employees.add(new Employee(5, "nitesh","delhi", 4000));
				employees.add(new Employee (7,"sandeep","mumbai",9000));
				System.out.println(employees);
		  }
		  else if(num==2) {
			  TreeSet<Employee> employees = new TreeSet<>(add);
			  employees.add(new Employee(1,"rizwan","mumbai",5000));
				employees.add(new Employee(2,"ravi","chennai",5000));
				employees.add(new Employee(4,"hemant","goa",6000));
				employees.add(new Employee(10,"pradum","kolkata",3000));
				employees.add(new Employee(5, "nitesh","delhi", 4000));
				employees.add(new Employee (7,"sandeep","mumbai",9000));
				System.out.println(employees);
		  }
		  else if(num==3) {
			  TreeSet<Employee> employees = new TreeSet<>(salary);
			  employees.add(new Employee(1,"rizwan","mumbai",5000));
				employees.add(new Employee(2,"ravi","chennai",5000));
				employees.add(new Employee(4,"hemant","goa",6000));
				employees.add(new Employee(10,"pradum","kolkata",3000));
				employees.add(new Employee(5, "nitesh","delhi", 4000));
				employees.add(new Employee (7,"sandeep","mumbai",9000));
				System.out.println(employees);
		  }
		  
		sc.close();
		
		
	}

}
