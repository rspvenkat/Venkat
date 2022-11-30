package String;

public class Splitarray {
	public static void main(String[]args) {
		
	
	String name="world wide wonder";
	String[]ans=name.split(" ");
	int leng1=ans[0].length();
	int leng2=ans[1].length();
	int leng3=ans[2].length();
	
	String upper1=ans[0].toUpperCase();
	String upper2=ans[1].toUpperCase();
	String upper3=ans[2].toUpperCase();
	
	String add=name.concat(" programs");
	
	System.out.println(leng1);
	System.out.println(leng2);
	System.out.println(leng3);
	System.out.println(upper1);
	System.out.println(upper2);
	System.out.println(upper3);
	System.out.println(add);


	

	
	
	}

}
