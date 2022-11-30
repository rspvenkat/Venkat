package Workout;

public class Car implements Comparable <Car>{
	String brand;
	int price;
	int modelyear;
	
	public Car (String brand,int price,int modelyear) {
		this.brand=brand;
		this.price=price;
		this.modelyear=modelyear;
	}
	
	
	
	
	public int compareTo(Car ee) {
		if(modelyear==ee.modelyear) {
			return 0;
		}
		else if(modelyear>ee.modelyear) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
