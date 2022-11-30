package Exception_handling;

public class ArithmeticExcep {
	public static void main(String[] args) {
		System.out.println("start");
		try {
		int a = 10;
		int b =  0;
		int c= a/b;
		System.out.println(c);		
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("say hi");
	}

}
