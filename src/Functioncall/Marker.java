package Functioncall;

public class Marker {
	String brand;
	String model;
	
public void even(Marker [] mark) {
	for(int i=0;i<mark.length;i++) {
		if(mark[i].brand.length()%2==0) {
			System.out.println(mark[i].brand);
		}
		
	}
	
	
}
	
}
