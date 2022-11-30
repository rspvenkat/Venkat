package Oops1;

public class Usestudent {
	public static void main(String[]args) {
		Department dep=new Department("mech",5,true);
		Student stu=new Student("hari",257,true,dep);
		System.out.println(stu);
	}

}
