package Exception_handling;

public class StringIndexoutOf {
	public static void main(String[] args) {
		System.out.println("start");
		try {
			String a="abcd";
			System.out.println(a.charAt(4));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.err.println(e);
		}
		System.out.println("end");
	}

}
