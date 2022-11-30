package Workout;

import java.util.Optional;

public class Opclass_of {
	public static void main(String[] args) {
		String[] name = new String[10];
		name[1]="venkat";
		name[2]="vivek";
		
		Optional<String> b = Optional.empty();         //.empty
		System.out.println(b);
		
		Optional<String> v = Optional.of(name[2]);        //.of
		System.out.println(v.get());
		System.out.println(v);
		System.out.println(v.hashCode());
		System.out.println(v.isEmpty());
		System.out.println(v.isPresent());
	}

}
