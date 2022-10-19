package Question_3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		
		//StudentMarksComp s= new StudentMarksComp();
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(105,"Ankit","noida", 570));
		students.add(new Student(100,"Rajesh","delhi", 580));
		students.add(new Student(101,"Aman","gurugram", 530));
		students.add(new Student(104,"Salim","bangalore", 560));
		students.add(new Student(100,"Rajesh","delhi", 580));  // duplicate 
		System.out.println(students);
		System.out.println(students.size());
		Set<Student> uniqueStudents = new LinkedHashSet<>(students);
		students = new ArrayList<>(uniqueStudents);
		System.out.println(students.size());
		System.out.println(students);
		
	      
		
	}
	

}
