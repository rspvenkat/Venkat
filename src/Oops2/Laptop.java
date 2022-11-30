package Oops2;

public class Laptop {
	String brand;
	int price;
	int tax;
	int discount;
	public int findnetprice() {
		return price;
	}
	public int findnetprice(int price,int tax) {
		return price+tax;
		
	}
	public int findnetprice(int price,int tax,int discount) {
		return (price+tax)-discount;
	}

}
