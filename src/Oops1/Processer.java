package Oops1;

public class Processer extends Mobile {
	private int price;
	private String model;
	private String brand;
	
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public String getModel() {
		return model;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}

}
