package Workout;

public class Methodrefence  {
	
	//public static void mul(int a,int b) {
		//System.out.println(a*b);
	//}
	public static void main(String[] args) {
//		Methodref md = Methodrefence::mul;
//		md.add(5,5);
//		
		Methodref hh =(int a,int b)->System.out.println(a+b);
		hh.add(10, 10);
	}

}
