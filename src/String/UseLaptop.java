package String;

public class UseLaptop {
	public static void main(String[]args){
		Laptop laptop1=new Laptop();
		laptop1.brand="DEL";
		laptop1.price=10000;
		laptop1.color="Bluue";
		
		String toupper=laptop1.brand.toUpperCase();
		int toength=laptop1.brand.length();
		boolean check=laptop1.brand.startsWith("D");
		char check2=laptop1.brand.charAt(laptop1.brand.length()-1);
		String col=laptop1.color.toLowerCase();
		
	System.out.println(toupper);
	System.out.println(toength);
	System.out.println(check);
	System.out.println(check2);
	System.out.println(col);
	
		
		
		
		
		
		
		
		
		
	}

}
