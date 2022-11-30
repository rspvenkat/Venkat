package Workout;

import java.util.ArrayList;
import java.util.Collections;

public class ModelyearCompatable {
	public static void main(String[] args) {
		Car c1=new Car("jagur",511111,2022);
		Car c2=new Car("bmw",858544,2020);
		Car c3=new Car("maruthi",858457,1996);
		
		ArrayList<Car> ee =new ArrayList<>();
		ee.add(c3);
		ee.add(c2);
		ee.add(c1);
		
		
		Collections.sort(ee);
		
		
		ee.forEach(x -> System.out.println(x.brand+" "+x.price+" "+x.modelyear));
		
	}
	

}
