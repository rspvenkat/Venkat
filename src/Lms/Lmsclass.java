package Lms;

public class Lmsclass {
	public static void main(String[]args) {
		int num1=Integer.parseInt(args[0]);
		float num3=Float.parseFloat(args[1]);
		boolean isPresent=Boolean.getBoolean(args[2]);
		String word=args[3];
		char letter=args[4].charAt(0);
		
		System.out.println(num1);
		System.out.println(num3);
		System.out.println(isPresent);
		System.out.println(word);
		System.out.println(letter);
	}
	

}
