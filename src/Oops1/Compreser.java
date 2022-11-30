package Oops1;

public class Compreser {
	private int capastiy;
	private String brand;
	private Boolean isCopper;
	
	public Compreser(int capastiy,String brand,Boolean isCopper) {
		this.brand=brand;
		this.capastiy=capastiy;
		this.isCopper=isCopper;
	}
	public String toString() {
		return brand+" "+capastiy+" "+isCopper;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setCapstity(int capastiy) {
		this.capastiy=capastiy;
	}
	public int getCapstity() {
		return capastiy;
	}
	public void setIsCopper(boolean isCopper) {
		this.isCopper=isCopper;
	}
	public boolean getIsCopper() {
		return isCopper;
	}

}
