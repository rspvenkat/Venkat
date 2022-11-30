package Workout;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UseComparator {
	public static void main(String[] args) {
		Employee emp1=new Employee("venkat",100,50000);
		Employee emp2=new Employee("jai",155,25000);
		Employee emp3=new Employee("raja",85,85845);
		ArrayList<Employee> ee= new ArrayList<>();
		ee.add(emp1);
		ee.add(emp2);
		ee.add(emp3);
		
		Collections.max(ee,new AgeCompartor());
		
		ee.forEach(x->System.out.println(x.name+" "+x.age+" "+x.salary));
		
	
		}
	

}
