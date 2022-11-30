package Oops3;

public abstract class SchoolBook implements Book {
	public void printPrice(int price) {
		System.out.println(price);
	}
	public int netprice(int price,int discountPrice) {
		return price-discountPrice;
	}
	public void modelNote(String model) {
		System.out.println(model);
	}
	public abstract void sizeNote(int size);




}
