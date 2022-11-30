package Exception_handling;

public class Sample {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception s) {
			s.printStackTrace();
//			System.out.println(s);
//			System.out.println("error occur");
		}
		finally {
		System.out.println("rest of code.....");
	}
}

}
