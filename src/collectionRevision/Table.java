package collectionRevision;

public class Table {
	private String brand;
	private int price;
	private Boolean isSteel;
	private int size;
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public Boolean getIsSteel() {
		return isSteel;
	}
	public int getSize() {
		return size;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setIsSteel(Boolean isSteel) {
		this.isSteel = isSteel;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Table(String brand, int price, Boolean isSteel, int size) {
		super();
		this.brand = brand;
		this.price = price;
		this.isSteel = isSteel;
		this.size = size;
	}
	public String toString() {
		return brand+" "+price+" "+isSteel+" "+size;
	}
	
	

}
