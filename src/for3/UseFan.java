package for3;

public class UseFan {
	public static void main(String[]args) {
		Fan fan1=new Fan();
		fan1.brand="havels";
		fan1.color="black";
		fan1.isFourWing=true;
		fan1.price=1500;
		Fan fan2=new Fan();
		fan2.brand="Cttt";
		fan2.color="orange";
		fan2.isFourWing=false;
		fan2.price=3000;
		Fan fan3=new Fan();
		fan3.brand="hero";
		fan3.color="green";
		fan3.isFourWing=true;
		fan3.price=1200;
		
		Fan[] fa= {fan1,fan2,fan3};
		
		/*for(int i=0;i<fa.length;i++) {
		if(fa[i].color.equalsIgnoreCase("black")){
			System.out.println(fa[i].brand+" "+fa[i].price);
		}*/
		
		/*for(int i=0;i<fa.length;i++) {
			if(fa[i].price>1000&&fa[i].price<2000) {
				System.out.println(fa[i].brand+" "+fa[i].price);
				
			}*/
		/*for(Fan a : fa) {
			if(a.price>1000&&a.price<2000) {
				System.out.println(a.brand+" "+a.price);
		
		}
		}*/
		
		for(int i=0;i<fa.length;i++) {
			if(fa[i].brand.contains("a")||fa[i].brand.contains("e")||fa[i].brand.contains("i")||fa[i].brand.contains("o")||fa[i].brand.contains("o")) {
				System.out.println(fa[i].brand+" it contain vowels");
			}
			else {
				System.out.println(fa[i].brand+" it has no vowels");
			}
		}
		/*for(Fan a :fa) {
			if(a.brand.length()>4) {
				System.out.println(a.price+" "+a.color);
			}
			
		}*/
		/*for(int i=0;i<fa.length;i++) {
			if(fa[i].isFourWing==false) {
				System.out.println(fa[i].price-(fa[i].price*5/100));
			}
		}*/

		
		
		
		
		
	
				
				
				
	}

}
