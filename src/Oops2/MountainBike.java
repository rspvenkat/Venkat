package Oops2;

public class MountainBike extends Bike {
	int price;
	int weight;
	
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setWeight(int weigth) {
		this.weight=weight;
	}
	public int getWeight() {
		return weight;
	}
	public MountainBike(String brand,String color,int price,int weight) {
		super(brand,color);
		this.price=price;
		this.weight=weight;
	}
	public String toString() {
		return super.getBrand()+" "+super.getColor()+" "+price+" "+weight;
	}
	

}
