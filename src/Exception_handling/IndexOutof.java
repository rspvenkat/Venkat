package Exception_handling;

public class IndexOutof {
	public static void main(String[] args) {
		System.out.println("start");
		try {
		   String[] a= {"arun","raj"};
		   System.out.println(a[3]);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
