package Oops2;

public class UseAddition {
	public static void main(String[]args) {
		Addition ad=new Addition();
		System.out.println(ad.add(10, 10));
		System.out.println(ad.add(10.0f, 20.0f));
		System.out.println(ad.add(50, 20.0f));
		System.out.println(ad.add(10, 20, 30));
		

		
	}

}
