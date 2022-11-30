
package Workout;

public class TryCatchFinally {
	public static void main(String[] args) {
//		try {
//			int a=100/0;
//			System.out.println(a);
//		}
//		
//		catch (ArithmeticException e){
//			System.out.println(e+" error");	
//		}
//		finally {
//			System.out.println("run always");
//		}
//	}

		try {
			int a=100/0;
			System.out.println(a);
		}
		
		catch (ArithmeticException e){
			System.out.println(e+" error");	
		}
		finally {
			
			try {
				int a=100/0;
				System.out.println(a);
			}
			
			catch (ArithmeticException e){
				System.out.println(e+" error");	
			}
		}
		
}
}
