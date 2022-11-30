package Functioncall;

public class UseMarker {
	public static void main(String[]args) {
		Marker marker1=new Marker();
		marker1.brand="RORITO";
		marker1.model="ballpoint";
		Marker marker2=new Marker();
		marker2.brand="cello";
		marker2.model="gell";
		Marker marker3=new Marker();
		marker3.brand="luxuzs";
		marker3.model="gell";
		
		Marker[] mark= {marker1,marker2,marker3};
		
		marker1.even(mark);
				
				
	}

}
