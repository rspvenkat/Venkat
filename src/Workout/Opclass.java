package Workout;

import java.util.Optional;

public class Opclass {
	public static void main(String[] args) {
		String[] name = new String[5];
		name[1]="venkat";
		name[2]="jeeva";
		
		Optional<String>checkNull=Optional.ofNullable(name[1]);    //.ofNullable
		if(checkNull.isPresent()) {
			String upper = name[1].toUpperCase();
			System.out.println(upper);
		}
		else 
			System.out.println("String not present");
	}

}
