package Col_2;
import java.util.*;

public class UseLaptop {
	public static void main(String[]args) {
		Laptop lap1=new Laptop("dell",100);
		Laptop lap2=new Laptop("hp",111);
		Laptop lap3=new Laptop("acer",500);
		Laptop lap4=new Laptop("lennovo",110);
		HashMap<Integer,Laptop>laps=new HashMap<>();
		laps.put(lap1.getId(), lap1);
		laps.put(lap2.getId(), lap2);
		laps.put(lap3.getId(), lap3);
		laps.put(lap4.getId(), lap4);
		
		ArrayList<Laptop>device=new ArrayList<>();
		      
		laps.values().forEach(x->device.add(x));
		System.out.println(device);
		
		
	}

}
