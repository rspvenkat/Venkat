package collectionRevision;

public class Laptop {
	private String brand;
	private int price;
	private boolean isTouchScreen;
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public boolean getIsTouchScreen() {
		return isTouchScreen;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setIsTouchScreen(boolean isTouchScreen) {
		this.isTouchScreen = isTouchScreen;
	}
	public Laptop(String brand, int price, boolean isTouchScreen) {
		this.brand = brand;
		this.price = price;
		this.isTouchScreen = isTouchScreen;
	}
	public String toString() {
		return brand+" "+price+" "+isTouchScreen;
	}
	

}
