package Functioncall;

public class Usechecking {
	public static void main(String[]args) {
		Checking a=new Checking();
		
		System.out.println(a.bio("venkat", 55));
		
		a.num(11);
		
		a.loop(100);
		System.out.println(a.nums(2));
	}

}
