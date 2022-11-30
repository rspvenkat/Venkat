package object;

public class UseStudentadd {
	public static void main(String[]args) {
		Studentadd student1=new Studentadd() ;
		student1.numberofdayspresentSchool=234;
		student1.totaldays=240;
		student1.percentage=75;
		student1.awnser=(student1.numberofdayspresentSchool*student1.percentage/100);
		System.out.println(student1.awnser);		
				
				
	}

}
