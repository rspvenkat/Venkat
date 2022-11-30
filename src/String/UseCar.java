package String;

public class UseCar {
	public static void main(String[]args) {
		Car car1=new Car();
		car1.brand="bmw";
		car1.model="xjdsj";
		car1.price=10000;
		car1.isPetrol=true;
		Car car2=new Car();
		car2.brand="audi";
		car2.model="gdgdg";
		car2.price=5000;
		car2.isPetrol=false;
		Car car3=new Car();
		car3.brand="benz";
		car3.model="bhahs";
		car3.price=10000;
		car3.isPetrol=true;
		
		
		int lenofcar1=car1.brand.length();
		int lenofcar2=car2.brand.length();
		int lenofcar3=car3.brand.length();
		
		int total=car1.price+car2.price+car3.price;
		System.out.println(total);
		 
		String uppercase1=car1.brand.toUpperCase();
		String uppercase2=car2.brand.toUpperCase();
		
		
		System.out.println(lenofcar1+" "+lenofcar2+" "+lenofcar3);
		System.out.println(uppercase1+" "+uppercase2);
		
		
		
		
		
		
		
	}

}
