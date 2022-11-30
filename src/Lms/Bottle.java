package Lms;

public class Bottle {
	private String brand;
	private int price;
	private String color;
	private boolean isMetal;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
}
	public void setIsMetal(boolean isMetal) {
		this.isMetal=isMetal;
	}
	public boolean getIsMetal() {
		return isMetal;
	}
	public Bottle(String brand,int price,String color,boolean isMetal) {
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.isMetal=isMetal;
	}
	public String toString() {
		return brand+" "+price+" "+color+" "+isMetal;
	}
}
