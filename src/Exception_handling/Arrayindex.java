package Exception_handling;

public class Arrayindex {
	public static void main(String[] args) {
		System.out.println("start");
	try {
		int[] a = {4,5,6};
		System.out.println(a[4]);
 	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.err.println("Error");
	}
	System.out.println("end");
	}

}
