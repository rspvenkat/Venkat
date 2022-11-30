package Col_3;
import java.util.*;
import java.util.stream.Collectors;

public class UseStudent {
	public static void main(String []args) {
		Student stu1=new Student("Venkat",18,"male",011,95);
		Student stu2=new Student("Pavadarani",45,"female",555,85);
		Student stu3=new Student("NimalRaj",22,"male",48,92);
		Student stu4=new Student("Prakash",44,"male",55,95);
		Student stu5=new Student("Arun",55,"male",75,55);
		Student stu6=new Student("Latha",85,"female",85,55);
		ArrayList<Student>stu=new ArrayList<>();
		stu.add(stu1);
		stu.add(stu2);
		stu.add(stu3);
		stu.add(stu4);
		stu.add(stu5);
		stu.add(stu6);
//		System.out.println(stu);
	//	stu.stream().filter(x->x.getAge()>55).forEach(x->System.out.println(x));
//		List<Student>gen=stu.stream().filter(x->x.getGender().equals("female")).filter(x->x.getName().endsWith("a")).collect(Collectors.toList());
//		gen.forEach(x->System.out.println(x));
//		List<Student>gen=stu.stream().filter(x->x.getGender().equals("male")).collect(Collectors.toList());
//		List<String>name=stu.stream().filter(x->x.getGender().equals("male")).map(x->x.getName()).collect(Collectors.toList());
//		name.forEach(x->System.out.println(x));
//		Map<Integer,Student>stud=stu.stream().filter(x->x.getAge()>=55).collect(Collectors.toMap(x->x.getRollno(),x->x));
//		stud.values().forEach(x->System.out.println(x));
		
		List<Integer>ex=stu.stream().map(x->x.getRollno()).collect(Collectors.toList());
		ex.forEach(x->System.out.println(x));
		System.out.println(ex);
//		
		
		
	}

}
