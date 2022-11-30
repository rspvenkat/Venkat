package Workout;

public class UseStaticKeywords {
	static int mul(int a,int b) {
		static int c;
		return a+b;
		
	}
	
	public static void main(String[] args) {
		StaticKeywords sk=new StaticKeywords();
		System.out.println(sk.add(10, 10));
	}
	
	

}
