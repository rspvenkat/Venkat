package Oops2;

public class UseTeacher {
	public static void main(String[]args) {
		Teacher t=new Teacher();
		t.name="venkat";
		t.age=25;
		t.isMale=true;
		
		System.out.println(t.eatingHour(1));
		System.out.println(t.sleepinghours(8));
		System.out.println(t.salary(50000));
		System.out.println(t.workinghours(8));
		
	System.out.println(t.name);
	System.out.println(t.age);
	System.out.println(t.isMale);
	}

}
