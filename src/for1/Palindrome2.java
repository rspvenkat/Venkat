package for1;

public class Palindrome2 {
	public static void main(String[]args) {
		String name="wow";
		String a="";
		
		for(int i=name.length()-1;i>=0;i--) {
			a=a+name.charAt(i);
		}
		
		if (name.equals(a)) { 
			System.out.println("pali");
		}
		else {
			System.out.println("not pali");
		}
	}

}
 