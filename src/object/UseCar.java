package object;

public class UseCar {
	public static void main(String[]args) {
		Car car1= new Car();
		car1.brand="hyndai";
		car1.color="red";
		car1.price=10000.00;
		car1.taxAmount=5000;
		car1.netPrice=car1.price+car1.taxAmount;

		Car car2= new Car();
		car2.brand="Tata";
		car2.color="blue";
		car2.price=15000.00;
		car2.taxAmount=5000;
		car2.netPrice=car2.price+car2.taxAmount;
		
		Car car3= new Car();
		car3.brand="nano";
		car3.color="orange";
		car3.price=154444.00;
		car3.taxAmount=5000;
		car3.netPrice=car3.price+car3.taxAmount;
		
		System.out.println(car1.brand+" "+car1.color+" "+car1.price+" "+car1.taxAmount+" ");
		System.out.println("NET PRICE IS = "+car1.netPrice);
		System.out.println(car2.brand+" "+car2.color+" "+car2.price+" "+car2.taxAmount+" ");
		System.out.println("NET PRICE IS ="+car2.netPrice);
		System.out.println(car3.brand+" "+car2.color+" "+car2.price+" "+car2.taxAmount+" ");
		System.out.println("NET PRICE IS ="+car3.netPrice);
		
		
		
		
				
		
		
		
		
	}

}
