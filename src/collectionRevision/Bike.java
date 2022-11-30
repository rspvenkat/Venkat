package collectionRevision;

public class Bike {
	private String brand;
	private int price;
	private boolean isPetrol;
	
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public boolean getIsPetrol() {
		return isPetrol;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setIsPetrol(boolean isPetrol) {
		this.isPetrol = isPetrol;
	}
	public Bike(String brand, int price, boolean isPetrol) {
		this.brand = brand;
		this.price = price;
		this.isPetrol = isPetrol;
	}
	public String toString() {
		return brand+" "+price+" "+isPetrol;
	}

}
