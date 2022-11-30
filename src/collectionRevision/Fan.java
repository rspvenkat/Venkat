package collectionRevision;

public class Fan {
	private String brand;
	private int price;
	private boolean isFourWing;
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public boolean getIsFourWing() {
		return isFourWing;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setIsFourWing(boolean isFourWing) {
		this.isFourWing = isFourWing;
	}
	public Fan(String brand, int price, boolean isFourWing) {
		this.brand = brand;
		this.price = price;
		this.isFourWing = isFourWing;
	}

	public String toString() {
		return brand+" "+price+" "+isFourWing;
	}
	
	
	
	

}
