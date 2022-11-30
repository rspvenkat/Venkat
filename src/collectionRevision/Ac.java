package collectionRevision;

public class Ac {
	private String brand;
	private boolean isInverter;
	private int price;
	private int ton;
	public String getBrand() {
		return brand;
	}
	public boolean getIsInverter() {
		return isInverter;
	}
	public int getPrice() {
		return price;
	}
	public int getTon() {
		return ton;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setIsInverter(boolean isInverter) {
		this.isInverter = isInverter;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setTon(int ton) {
		this.ton = ton;
	}
	public Ac(String brand, boolean isInverter, int price, int ton) {
		
		this.brand = brand;
		this.isInverter = isInverter;
		this.price = price;
		this.ton = ton;
	}
	public String toString() {
		return brand+" "+isInverter+" "+price+" "+ton;
	}
	
	

}
