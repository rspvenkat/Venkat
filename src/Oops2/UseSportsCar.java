package Oops2;

public class UseSportsCar {
	public static void main(String[]args) {
		SportsCar s =new SportsCar();
		
		s.brand="Audi";
		s.price=200000;
		s.color="blue";
		System.out.println(s.brand+" "+s.color+" "+s.price);
		System.out.println(s.milage(20));
		System.out.println(s.tankcapacity(50));;
		System.out.println(s.carspeed(250));
		System.out.println(s.runingtime(8));
		
	}

}
