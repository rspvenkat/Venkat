package Col_2;

public class Laptop {
	private String brand;
	private int id;
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
	public Laptop(String brand,int id) {
		this.brand=brand;
		this.id=id;
	}
	public String toString() {
		return brand+" "+id;
	}
	

}
