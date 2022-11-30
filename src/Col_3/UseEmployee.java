package Col_3;
import java.util.*;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String[]args) {
		Employee emp1=new Employee("venkat",100,25,55400,"male","HR");
		Employee emp2=new Employee("arun",150,45,25400,"male","FrontEnd Developer");
		Employee emp3=new Employee("Nirmal",250,28,25000,"male","BackEnd Developer");
		Employee emp4=new Employee("Bavadharani",122,35,45000,"female","Tester");
		Employee emp5=new Employee("Arujun",855,42,85000,"male","TL");
		Employee emp6=new Employee("Deva",555,85,25000,"male","PL");
		HashMap<Integer,Employee>emp=new HashMap<>();
		emp.put(1, emp1);
		emp.put(2, emp2);
		emp.put(3, emp3);
		emp.put(4, emp4);
		emp.put(5, emp5);
		emp.put(6, emp6);
		
		List<Employee>empl=emp.values().stream().filter(x->x.getGender().equalsIgnoreCase("female")&&x.getSalary()>30000).collect(Collectors.toList());
		empl.forEach(x->System.out.println(x));
		
//		Map<Integer,Employee>empll=emp.values().stream().filter(x->x.getGender().equalsIgnoreCase("female")&&x.getSalary()>30000).collect(Collectors.toMap(x->x.getId(),x->x));
//		empll.values().forEach(x->System.out.println(x));
	
		




	}

}
