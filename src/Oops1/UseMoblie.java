package Oops1;

public class UseMoblie {
	public static void main(String[]args) {
		Battery bat1=new Battery ();
		bat1.brand="Samsung";
		bat1.maah=1200;
		bat1.price=1000;
		
		Moblie mob1=new Moblie();
		mob1.brand="Samsung";
		mob1.color="blue";
		mob1.isWarranty=true;
		mob1.price=10000;
		mob1.battery=bat1;
		
		Battery bat2=new Battery ();
		bat2.brand="noika";
		bat2.maah=2000;
		bat2.price=5000;
		
		Moblie mob2=new Moblie();
		mob2.brand="noika";
		mob2.color="yellow";
		mob2.isWarranty=false;
		mob2.battery=bat2;
		
		System.out.println(bat1.brand+" "+mob1.price+" "+bat2.maah);
		
		
		
		
	}

}
