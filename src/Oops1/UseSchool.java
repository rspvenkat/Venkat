package Oops1;
import java.util.*;
import java.util.stream.Collectors;

import collectionRevision.Student;
import collectionRevision.Teacher;
import collectionRevision.School;

public class UseSchool {
	public static void main(String[]args) {
		Student stu1=new Student("venkat",18,"nine");
		Student stu2=new Student("arujun",16,"ten");
		Student stu3=new Student("nimal",5,"six");
		
		Teacher t1=new Teacher("latha",55,5855,true);
		Teacher t2=new Teacher("hema",18,45414,false);
		Teacher t3=new Teacher("mala",85,85000,true);
		
		School s1=new School("madurai","pvr",10,150,t1,stu1);
		School s2=new School("theni","rss",15,555,t2,stu2);
		School s3=new School("chennai","hrs",25,850,t3,stu3);
		
		HashMap<Integer,School>sc=new HashMap<>();
		sc.put(1, s1);
		sc.put(2, s2);
		sc.put(3, s3);
		
//		List<String>v=sc.values().stream().map(x->x.getStudent().getName()).collect(Collectors.toList());
//		v.forEach(x->System.out.println(x));
//		List<String>e=sc.values().stream().map(x->x.getStudent()).map(x->x.getName()).collect(Collectors.toList());
//		e.forEach(x->System.out.println(x));
		long num=sc.values().stream().filter(x->x.getTeacher().getAge()>=50).filter(y->y.getStudent().getAge()>=15).count();
		System.out.println(num);
		
		
		
		
		
		
		
		
	}

}
