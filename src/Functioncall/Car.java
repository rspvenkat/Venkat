package Functioncall;

public class Car {
	String brand;
	int price;
	String color;
	String model;
	
	public void findmax(Car[]a) {
		int temp=a[0].price;
		int index=0;
		for(int i=0;i<a.length;i++) {
			if(a[i].price>=temp) {
				temp=a[i].price;
				index=i;
			}
		}
		System.out.println(a[index].brand+" "+a[index].color);
	}
}
