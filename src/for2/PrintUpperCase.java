package for2;

public class PrintUpperCase {
	public static void main(String[]args) {
		String[] brand=new String[6];
		brand[0]="adidas";
		brand[1]="VKC";
		brand[2]="puma";
		brand[3]="BATA";
		brand[4]="sparks";
		brand[5]="LEVIES";
		for(int i=0;i<brand.length;i++) {
			if(brand[i].equals(brand[i].toUpperCase())) {
				System.out.println(brand[i]);  
			}
			
		}
		
		
	}

}
