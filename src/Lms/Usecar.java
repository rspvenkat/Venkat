package Lms;

public class Usecar {
	public static void main(String[]args) {
		Car car1=new Car();
		car1.brand=args[0];
		car1.price=Integer.parseInt(args[1]);
		car1.taxamount=Integer.parseInt(args[2]);
		car1.color=args[3];
		car1.netprice=car1.price+car1.taxamount;
		System.out.println(car1.brand.toUpperCase());
		System.out.println(car1.color.toUpperCase());
		System.out.println(car1.netprice);
		
		
		
		
	}

}

class Car{
	String brand;
	String color;
	int price;
	int taxamount;
	int netprice;
	
	
}

