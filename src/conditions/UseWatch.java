package conditions;

public class UseWatch {
	public static void main(String[]args) {
		Watch watch1=new Watch();
		watch1.brand="xxxx";
		watch1.colour="Green";
		watch1.price=1550;
		watch1.isWaterProof=true;
		Watch watch2=new Watch();
		watch2.brand="titian";
		watch2.colour="black";
		watch2.price=1000;
		watch2.isWaterProof=false;
		Watch watch3=new Watch();
		watch3.brand="fasttrack";
		watch3.colour="White";
		watch3.price=3000;
		watch3.isWaterProof=true;
		
		
		if(watch1.brand.contains("a")||watch1.brand.contains("e")||watch1.brand.contains("i")||watch1.brand.contains("o")||watch1.brand.contains("u")) {
			System.out.println(watch1.brand+" contains vowels");
		}
		else {
			System.out.println(watch1.brand+"not contains");
		}
		
		if (watch2.colour.equalsIgnoreCase
				("Green")) {
			System.out.println(watch2.brand+watch2.price);
		}
		else {
			System.out.println(watch2.colour);
		}
			
		

		
		
			
	}

}
