package Oops2;

public class Bike {
	private String brand;
	private String color;
	
	public void setBrand(String brand) {        //GETSETMETHOD
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public String bikeMilage(int mail) {
		return "bike Milage"+mail;
	}
	public Bike(String brand,String color) {   //CONSTCTOR
		this.brand=brand;
		this.color=color;
	}
	public String toString() {                 //TOSTRING
		return brand+" "+color;
	}
	

}
