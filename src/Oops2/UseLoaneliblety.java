package Oops2;

public class UseLoaneliblety {
	public static void main(String[]args) {
		LoanEligblety lo= new LoanEligblety();
		System.out.println(lo.findloanelible());
		System.out.println(lo.findloanelible(100000, 30000));
		System.out.println(lo.findloanelible(6000, 1000));
		
	}

}
