package String;

public class Usepen {
	public static void main(String[]args) {
		Pen pen1=new Pen();
		pen1.brand="hero";
		pen1.color="orange";
		Pen pen2=new Pen();
		pen2.brand="cello";
		pen2.color="red";
		
		String con=	pen1.brand.concat(pen2.brand);
		String con2=pen1.color.concat(pen2.color);
		
		String toup=pen1.brand.toUpperCase();
		String toup1=pen2.brand.toUpperCase();
		
		boolean check=con.contains("R");
		
		boolean check1=pen1.brand.equals("blue");
		boolean check2=pen2.brand.equals("red");
		
		char find1=pen1.brand.charAt(3);
		char find2=pen2.brand.charAt(2);
		
		String ans=con.toLowerCase();
		
		String [] ans1=pen1.brand.split("");
		String ans2=ans1[0];
		String ans3=ans1[1];
		String ans4=ans1[2];
		String ans5=ans1[3];
		
		int len=con2.length();
		
		System.out.println(toup);
		System.out.println(check);
		System.out.println(check1);
		System.out.println(check2);
		System.out.println(find1);
		System.out.println(find2);
		System.out.println(ans);
		System.out.println(ans2);
		System.out.println(ans3);
		System.out.println(ans4);
		System.out.println(ans5);
		System.out.println(len);


		
				
		
		
		
	}
	

}
