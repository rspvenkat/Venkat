package object;

public class Usemarker {
	public static void main(String[]args) {
		Marker marker1=new Marker();
		marker1.brand="Faber";
		marker1.price=50;
		marker1.color="black";
		marker1.isRefillable=true;
		Marker marker2=new Marker();
		marker2.brand="deans";
		marker2.price=50;
		marker2.color="blue";
		marker2.isRefillable=true;
		System.out.println(marker1.brand+" "+marker1.price+" "+marker1.color+" "+marker1.isRefillable);
		System.out.println(marker2.brand+" "+marker2.price+" "+marker2.color+" "+marker2.isRefillable);

		
		

		
		
		
	}

}
