package for1;

public class Stringlastname {
		public static void main(String[]args) {
			String name="communication";
			String rev="";
			
			for(int i=name.length()-1;i>=0;i--) {
				System.out.println(name.charAt(i));
//			}
//			for(int i=name.length()-1;i>=0;i--) {
			rev=rev+(name.charAt(i));
							
			}
			System.out.println(rev);
		}

	}

