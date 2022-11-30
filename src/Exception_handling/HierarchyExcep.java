package Exception_handling;

public class HierarchyExcep {
	public static void main(String[] args) {
		System.out.println("hello");
		String a ="hello";
		try {
			System.out.println(a.charAt(9));
		}
		catch(StringIndexOutOfBoundsException se) {
			se.printStackTrace();
		}
		catch (IndexOutOfBoundsException e) {
		    e.printStackTrace();
		}
		catch (Exception s) {
			s.printStackTrace();
		}
		System.out.println("bye");
	}

}
