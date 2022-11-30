package Oops1;

public class Ac {
	private String brand;
	private int price;
	private String color;
	private Compreser compreser;
	
	public Ac(String brand,int price,String color,Compreser compreser) {
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.compreser=compreser;
	}
	public String toString() {
		return brand+" "+price+" "+color+" "+compreser;
	}
	
	
	
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
	public void setCompreser(Compreser comprese) {
		this.compreser=comprese;
	}
	public Compreser getCompresr() {
		return compreser;
	}
	

}
