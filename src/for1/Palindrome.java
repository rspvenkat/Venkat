package for1;

public class Palindrome {
	public static void main(String[]args) {
		String name="madam";
		String rev="";
		
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		
		
		
		
		if(name.equalsIgnoreCase(rev)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
