package String;

public class Splitexample {
	public static void main(String[]args) {
		String name="venkat,deva,arujun,amar";
		String[] ans=name.split(","); 
		String a=ans[0].toUpperCase();
		String b=ans[1].toLowerCase();
		String c=ans[2].concat(b);
		int d=ans[3].length();
		System.out.println(ans);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		
		
		
	}

}
