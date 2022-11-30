package Oops2;

public class UseSchoolStudent {
	public static void main(String[]args) {
		SchoolStudent sc=new SchoolStudent();
		sc.name="venkat";
		sc.age=26;
		sc.rollno=100;
		sc.height=55.0f;
		System.out.println(sc.name);
		System.out.println(sc.age);
		System.out.println(sc.rollno);
		System.out.println(sc.height);
		System.out.println(sc.mark(100, 50, 50, 100));
		System.out.println(sc.rank("a"));
		System.out.println(sc.name("venkat"));
		System.out.println(sc.average(100, 50, 85, 35, 40));
		
	}

}
