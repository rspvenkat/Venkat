package Oops1;

public class UseMarker {
	public static void main(String []args) {
		Marker mar=new Marker();
		mar.setBrand("hero");
		mar.setPrice(150);
		mar.setColor("blue");
		mar.setDom(5);
		
		//int add=mar.getDom()+mar.getPrice();
		
		String uppercase=mar.getBrand().toUpperCase();
		int forward=mar.getPrice();
		
		for(int i=1;i<=forward;i++) {
			System.out.println(uppercase);
		}
		
		//System.out.println(add);
		System.out.println(uppercase);
		
	}

}
