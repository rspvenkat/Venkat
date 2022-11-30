package object;

public class UseShirt {
	public static void main(String[]args) {
		Shirt shirt1=new Shirt();
		shirt1.brand="lives";
		shirt1.price=555;
		shirt1.size='L';
		shirt1.disamount=200;
		shirt1.netprice=shirt1.price-shirt1.disamount;
		System.out.println(shirt1.brand+" "+shirt1.price+" "+shirt1.size+" "+shirt1.disamount+" net price is "+shirt1.netprice);
		
		Shirt shirt2=new Shirt();
		shirt2.brand="puma";
		shirt2.price=1005;
		shirt2.size='M';
		shirt2.disamount=200;
		shirt2.netprice=shirt2.price-shirt2.disamount;
		System.out.println(shirt2.brand+" "+shirt2.price+" "+shirt2.size+" "+shirt2.disamount+" net price is "+shirt2.netprice);
		
		
		
	}

}
