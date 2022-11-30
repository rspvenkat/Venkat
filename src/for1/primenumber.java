package for1;

public class primenumber {
	public static void main(String[]args) {
	int num=5;
	boolean isPrime = true ;
	
	for(int i=2;i<num;i++) {
		if(num%i==0) {
			isPrime=false;
		}
		
	}
	if(isPrime==true) {
		System.out.println("prime");
	}
	else {
		System.out.println("not prime");
	}

}
}
