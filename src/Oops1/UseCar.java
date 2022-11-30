package Oops1;

public class UseCar {
	public static void main(String []args) {
		Engine eng1=new Engine();
		eng1.setBrand("Honda");
		eng1.setPrice(1000000);
		eng1.setnoOfPiston(5);
		
		Car car1=new Car();
		car1.setBrand("honda");
		car1.setColor("blue");
		car1.setPrice(50000);
		car1.setEngine(eng1);
		
		Engine eng2=new Engine();
		eng2.setBrand("benz");
		eng2.setPrice(5000000);
		eng2.setnoOfPiston(8);
		
		Car car2=new Car();
		car2.setBrand("benz");
		car2.setColor("orange");
		car2.setPrice(50000);
		car2.setEngine(eng2);
		
		System.out.println(car1.getColor());
		System.out.println(car1.getEngine().getBrand());
		
		
		
	}

}
