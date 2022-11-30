package for3;

public class UseShirt {
	public static void main(String[]args) {
		Shirt shirt1=new Shirt();
		shirt1.brand="levies";
		shirt1.color="green";
		shirt1.size="L";
		shirt1.isChecked=true;
		shirt1.price=1500;
		
		Shirt shirt2=new Shirt();
		shirt2.brand="louis";
		shirt2.color="black";
		shirt2.size="Xl";
		shirt2.isChecked=true;
		shirt2.price=2000;
		
		Shirt shirt3=new Shirt();
		shirt3.brand="Ramraaaaj";
		shirt3.color="white";
		shirt3.size="L";
		shirt3.isChecked=true;
		shirt3.price=2050;  
		
		Shirt shirt4=new Shirt();
		shirt4.brand="raymoon";
		shirt4.color="yellow";
		shirt4.size="S";
		shirt4.isChecked=false;
		shirt4.price=3000;
		
		Shirt[] shi= {shirt1,shirt2,shirt3,shirt4};
		
		/*int min=shi[0].price;
		String temp="";
		for(int i=0;i<shi.length;i++) {
			if(shi[i].price<=min) {
				min=shi[i].price;
				temp=shi[i].brand;
			}
		}
		System.out.println(temp);*/
		/*int max=shi[0].brand.length();
		String temp="";
		for(int i=0;i<shi.length;i++) {
			if(shi[i].brand.length()>=max) {
				max=shi[i].brand.length();
				temp=shi[i].color;
			}
		}
		System.out.println(temp);*/
		
		int mini=shi[0].price;
		int index=0;
		
		for(int i=0;i<shi.length;i++) {
			if(shi[i].price<=mini) { 
				mini=shi[i].price;
				index=i;			
			}
		}
		System.out.println(shi[index].brand+" "+shi[index].color+" "+shi[index].price+" "+shi[index].isChecked);
		
		
	}
		

}
