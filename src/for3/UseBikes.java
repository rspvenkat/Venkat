package for3;

public class UseBikes {
	public static void main(String[]args) {
		Bikes bike1=new Bikes();
		bike1.name="honda";
		bike1.price=500000;
		bike1.mailage=100;
		Bikes bike2=new Bikes();
		bike2.name="suzuki";
		bike2.price=8000000;
		bike2.mailage=30;
		Bikes bike3=new Bikes();
		bike3.name="pulsar";
		bike3.price=10000;
		bike3.mailage=40;
		Bikes bike4=new Bikes();
		bike4.name="apache";
		bike4.price=5000;
		bike4.mailage=60;
		
		Bikes[] bikers= {bike1,bike2,bike3,bike4};
		
		/*int max=bikers[0].price;
		String biname="";
		for(int i=0;i<bikers.length;i++) {
		if(bikers[i].price>=max) {
			max=bikers[i].price;
			biname=bikers[i].name;
			
			
		}
	}
		System.out.println(biname);
		for(int i=0;i<biname.length();i++) {
			System.out.println(biname.charAt(i));
			System.out.println(max);*/
		int max=bikers[0].price;
		int min=bikers[0].price;
		for(int i=0;i<bikers.length;i++) {
			if(bikers[i].price>=max) {
				max=bikers[i].price;
			}
			
			if(bikers[i].price<=min) {
				min=bikers[i].price;
			}
			
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(max+min);



}
}
