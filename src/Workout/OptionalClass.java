package Workout;

import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {
		int[] num =	new int[1];
		Optional<Integer> checkNull = Optional.ofNullable(num[5]);
		if (checkNull.isPresent()) {
			
			int word = num[1]*num[1];
			System.out.println(word);
		}
		else {
			System.out.println("it has no values");
		}
		
	}

}
