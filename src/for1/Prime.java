package for1;

public class Prime {
	public static void main(String []args) {
		int number =14;
		boolean prime=true;
		for (int i=2;i<number;i++) {
			if(number%i==0) {
				prime=false;
			}
		}
		if(prime==true) {
			System.out.println(number+" is prime");
		}
		else {
			System.out.println(number+" is not prime");
		}
	}

}
