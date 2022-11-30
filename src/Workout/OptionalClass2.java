package Workout;

import java.util.Optional;

public class OptionalClass2 {
	public static void main(String[] args) {
		String [] name = new String[10];
		name[1]="venkat";
		Optional<String> value = Optional.of(name[1]);
		if (value.isPresent()) {
		System.out.println(value.get());
	}
		else {
			System.out.println("no values");
		}

}
}