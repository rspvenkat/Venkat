package Exception_handling;

public class NameException extends Exception {
	public NameException (String a) {
		super (a);
	}
	public void printStackTrace() {
		System.out.println("Error");
	}

}
