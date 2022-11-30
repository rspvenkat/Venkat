package Col_2;

public class Mobile {
	private String brand;
	private int id;
	private int price;
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public Mobile(String brand,int id,int price) {
		this.brand=brand;
		this.id=id;
		this.price=price;
	}
	public String toString() {
		return brand+" "+id+" "+price;
	}
}
