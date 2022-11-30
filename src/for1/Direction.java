package for1;

public class Direction {
	public static void main(String[] args) {
		String a= args[0];
		
		if(a.charAt(0)=='N') {
			System.out.println("North");
		}
		else if(a.charAt(0)=='S') {
			System.out.println("South");
		}
		else if(a.charAt(0)=='E') {
			System.out.println("East");
		}
		else {
			System.out.println("West");
		}
		
		
	}

}
