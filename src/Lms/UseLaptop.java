package Lms;

public class UseLaptop {
	public static void main(String[]args) {
		Laptop laptop1=new Laptop();
		String[] a=args[0].split("#");
		String[] b=args[1].split("#");
		
		laptop1.Brand=a[0];
		laptop1.price=Integer.parseInt(a[1]);
		laptop1.color=a[2];
		laptop1.isTouchScreen=Boolean.parseBoolean(a[3]);
		laptop1.percentage=Integer.parseInt(a[4]);
		laptop1.netprice=(laptop1.price*laptop1.percentage/100)+laptop1.price;
		
		Laptop laptop2=new Laptop();
		laptop2.Brand=b[0];
		laptop2.price=Integer.parseInt(b[1]);
		laptop2.color=b[2];
		laptop2.isTouchScreen=Boolean.parseBoolean(b[3]);
		laptop2.percentage=Integer.parseInt(b[4]);
		laptop2.netprice=(laptop2.price+laptop2.percentage/100)+laptop2.price;
		
		System.out.println(" Brand: "+laptop1.Brand+" price :"+laptop1.price+" color :"+laptop1.color+" touchsreen :"+laptop1.isTouchScreen+" netprice :"+laptop1.netprice);
		System.out.println(" Brand: "+laptop2.Brand+" price :"+laptop2.price+" color :"+laptop2.color+" touchsreen :"+laptop2.isTouchScreen+" netprice :"+laptop2.netprice);

		
		
		
		
			
	}

	
	

}
class Laptop{
	String Brand;
	int price;
	String color;
	boolean isTouchScreen;
	int percentage;
	int netprice;
	
}