package Functioncall;

public class Cars {
	public int findTaxAmount(int price,int taxPercentage) {
		int taxamount=price*taxPercentage/100;
		return taxamount;
	}

}
