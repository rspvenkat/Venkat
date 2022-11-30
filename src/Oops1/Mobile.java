package Oops1;

public class Mobile {
	private String brand;
	private int price;
	private Processer processer;
	private Batterys batterys;
	private Display display;
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setProcesser(Processer processer) {
		this.processer=processer;
	}
	public Processer getprocesser() {
		return processer;
	}
	public void setBatterys(Batterys batterys) {
		this.batterys=batterys;
	}
	public Batterys getBatterys() {
		return batterys;
	}
	public void setDisplay(Display display) {
		this.display=display;
	}
	public Display getDisplay() {
		return display
	}

}
