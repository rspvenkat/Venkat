package for3;

public class UseBike {
	public static void main(String[] args) {
		Bike bike1=new Bike();
		bike1.brand="hero";
		bike1.color="green";
		bike1.model="1996";
		bike1.enginecc="152cc";
		bike1.price=150000;
		
		Bike bike2=new Bike();
		bike2.brand="fz";
		bike2.color="black";
		bike2.model="2000";
		bike2.enginecc="200cc";
		bike2.price=120000;
		
		Bike bike3=new Bike();
		bike3.brand="honda";
		bike3.color="orange";
		bike3.model="2015";
		bike3.enginecc="152cc";
		bike3.price=250000;
		
		Bike bike4=new Bike();
		bike4.brand="yamaha";
		bike4.color="blue";
		bike4.model="2015";
		bike4.enginecc="192cc";
		bike4.price=200000;
		
		Bike[] twowe= new Bike[4];
		twowe[0]=bike1;
		twowe[1]=bike2;
		twowe[2]=bike3;
		twowe[3]=bike4;
		
		/*for(Bike i:twowe) {
			System.out.println(i.brand+" "+i.price);
		}*/
		for(int i=twowe.length-1;i>=0;i--) {
			System.out.println(twowe[i].brand+" "+twowe[i].price);
		}
		/*for(int i=twowe.length-1;i>twowe.length/2;i--) {
			System.out.println(twowe[i].brand+" "+twowe[i].price);
		}*/
		for(int i=0;i<twowe.length;i++) {
			System.out.println(twowe[i].price+100);
		}
			
		
	
		
	}
	

}
