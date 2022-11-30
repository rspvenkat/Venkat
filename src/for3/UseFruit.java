package for3;

public class UseFruit {
	public static void main(String[] args) {
		Fruit fruit1=new Fruit();
		fruit1.fruitName="Banana";
		fruit1.price=120;
		fruit1.isHybrid=true;
		
		Fruit fruit2=new Fruit();
		fruit2.fruitName="orange";
		fruit2.price=100;
		fruit2.isHybrid=false;
		
		Fruit fruit3=new Fruit();
		fruit3.fruitName="mango";
		fruit3.price=50;
		fruit3.isHybrid=true;
		
		Fruit fruit4=new Fruit();
		fruit4.fruitName="gova";
		fruit4.price=500;
		fruit4.isHybrid=false;
		
		Fruit fruit5=new Fruit();
		fruit5.fruitName="graphs";
		fruit5.price=40;
		fruit5.isHybrid=true;
		
		Fruit fruit6=new Fruit();
		fruit6.fruitName="pineaaple";
		fruit6.price=55;
		fruit6.isHybrid=true;
		
		Fruit[] fru= {fruit1,fruit2,fruit3,fruit4,fruit5,fruit6};
		
		for(int i=0;i<fru.length;i++) {
			System.out.println(fru[i].fruitName+" "+fru[i].price);
		}
		
		/*for(int i=fru.length-1;i>=0;i--) {
			System.out.println(fru[i].fruitName+" "+fru[i].price);
		}*/
		
		/*for(int i=0;i<fru.length/2;i++) {
			System.out.println(fru[i].fruitName+" "+fru[i].price );
		}*/
		 
		/*for(int i=fru.length/2-1;i>=0;i--) {
			System.out.println(fru[i].fruitName+" "+fru[i].price);
		}*/
		
		/*for(int i=fru.length/2;i<fru.length;i++) {
			System.out.println(fru[i].fruitName+" "+fru[i].price);
		}*/
		/*for(int i=fru.length-1;i>=fru.length/2;i--) {
			System.out.println(fru[i].fruitName+" "+fru[i].price);
		}*/
			
	}

}
