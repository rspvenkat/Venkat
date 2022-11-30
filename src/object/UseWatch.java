package object;

public class UseWatch {
	public static void main(String[]args) {
		Watch watch1=new Watch();
		watch1.brand="Rolex";
		watch1.price=2000;
		watch1.StrapType="Metal";
		watch1.color="Blue";
		watch1.discountPercentage=10;
		watch1.netprice=watch1.price-(watch1.price*watch1.discountPercentage/100);
		System.out.println(watch1.brand+" "+watch1.netprice);
		
		
		
	}

}
