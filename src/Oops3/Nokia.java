package Oops3;

public class Nokia extends SmartPhones{
	public String smartPhoneVerison(String verison) {
		return verison;
	}
	public void waterproof() {
		System.out.println("yes its waterprof");
	}
	public  int emi(int noOfMonths,int price) {
		if(noOfMonths>0&&noOfMonths<=6) {
			return price+(price*7/100);
		}
		else if(noOfMonths>=7&&noOfMonths<=12) {
			return price+(price*9/100);
		}
		else if(noOfMonths>=13&&noOfMonths<=18) {
			return price+(price*12/100);
		}
		else {
			return 0;
		}
	}
	




}
