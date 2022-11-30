package Exception_handling;

public class NullpointExcep {
	public static void main(String[] args) {
		System.out.println("start");
		try {
			String a=null;
			System.out.println(a.toLowerCase());
		}
		catch (NullPointerException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
