package collectionRevision;

public class Marker {
	private String brand;
	private int price;
	private boolean isDustFree;
	private String color;
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public boolean getIsDustFree() {
		return isDustFree;
	}
	public String getColor() {
		return color;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setIsDustFree(boolean isDustFree) {
		this.isDustFree = isDustFree;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Marker(String brand, int price, boolean isDustFree, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.isDustFree = isDustFree;
		this.color = color;
	}
	public String toString() {
		return brand+" "+price+" "+isDustFree+" "+color;
	}
	
	
	
	

}
