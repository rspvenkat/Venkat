package Functioncall;

public class UseCar {
	public static void main(String[]args) {
		Car car1=new Car();
		car1.brand="BMW";
		car1.color="Blue";
		car1.model="2015";
		car1.price=1500000;
		Car car2=new Car();
		car2.brand="AUDI";
		car2.color="GREEN";
		car2.model="2018";
		car2.price=5000000;
		Car car3=new Car();
		car3.brand="JAGUAR";
		car3.color="RED";
		car3.model="2022";
		car3.price=8000000;
		
		Car[] cars= {car1,car2,car3};
		
		car1.findmax(cars);
		
		
	
				
	}
	
	

}
