package for3;

public class UseLaptop {
	public static void main(String []args) {
		Laptop laptop1=new Laptop();
		laptop1.brand="Hp";
		laptop1.price=150000;
		laptop1.color="Green";
		laptop1.isTouchScreen=true;
		
		Laptop laptop2=new Laptop();
		laptop2.brand="Dell";
		laptop2.price=50000;
		laptop2.color="blue";
		laptop2.isTouchScreen=false;
		
		Laptop laptop3=new Laptop();
		laptop3.brand="Lenova";
		laptop3.price=200000;
		laptop3.color="yellow";
		laptop3.isTouchScreen=true;
		Laptop[] laps=new Laptop[3];
		laps[0]=laptop1;
		laps[1]=laptop2;
		laps[2]=laptop3; 
		for(int i=0;i<laps.length;i++) {
			System.out.println(laps[i].brand+" "+laps[i].price);
		}
		for(int i=laps.length-1;i>=0;i--) {
			System.out.println(laps[i].brand+" "+laps[i].price);

			
		}
	}

}
