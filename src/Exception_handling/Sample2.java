package Exception_handling;

public class Sample2 {
	public static void main(String[] args) {
		System.out.println("start");
		try {
			int a=5;
			int b=0;
			System.out.println(a/b);
		}
		finally {
			try {
				int a=10;
				int b=0;
				System.out.println(a/b);
			}
			catch(Exception e) {
				System.out.println("show error");
			}
		
			
		}
	}

}
