package Col_1;
import java.util.ArrayList;


public class UseStudent {
	public static void main(String[]args) {
		Student stu1=new Student("venkat",100,"a",true);
		Student stu2=new Student("hema",101,"b",false);
		Student stu3=new Student("deva",102,"g",true);
		Student stu4=new Student("latha",103,"h",false);
		Student stu5=new Student("ramesh",104,"j",true);
		Student stu6=new Student("john",105,"h",true);
		ArrayList<Student>stu=new ArrayList<>();
		stu.add(stu1);
		stu.add(stu2);
		stu.add(stu3);
		stu.add(stu4);
		stu.add(stu5);
		stu.add(stu6);
		
		ArrayList<Student>maleStudent=new ArrayList<>();
		
		ArrayList<Student>femaleStudent=new ArrayList<>();
		
		stu.forEach(s->{
			if(s.getIsMale()==true) {
				maleStudent.add(s);
			}
			else {
				femaleStudent.add(s);
			}
		});
//		Student add=stu6;
//		for(int i=0;i<stu.size();i++) {
//			if(stu.get(i).getIsMale()==true) {
//				add = stu.get(i);
//			}
//			System.out.println(add);
		
//		for(Student s:femaleStudent) {
//			System.out.println(s);
//		}
	
		}


		
	}






