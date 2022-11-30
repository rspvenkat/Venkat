package Oops2;

public class LoanEligblety { //OVERLOADING
	public String findloanelible() {
	return "eligble 30000";
	}
	public String findloanelible(int salary,int amount) {
		return "eligble"+(salary*10+amount);
	}
	public String findloanelible(int salary,int propertyvalue,int amount) {
		return "eligble amount"+(propertyvalue/2+salary*10+findloanelible());
	}
}
             