package Workout;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		String name= sc.nextLine();
		boolean maleorfemale = sc.nextBoolean();
		long phoneno= sc.nextLong();
		System.out.println("number "+number);
		System.out.println("name "+name);
		System.out.println("maleorfemale "+maleorfemale);
		System.out.println("phoneno "+phoneno);
		
	}

}
