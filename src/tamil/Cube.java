package tamil;

public class Cube {
	public int findCube(int a) {
		return a*a*a;
	}
	public String findSqr(int a) {
		return a*a+" Square";
	}
	public String condition(int a) {
		if(a%2==0) {
			return a+" is even";
		}
		else {
			return a+" is odd";
		}
	}
	public String day() {
		int a=2;
		switch(a) {
		case 1: return "Sunday";
		case 2:return "Monday";
		case 3:return "Tuesday";
		case 4:return "Wednesday";
		case 5:return "Thursday";
		case 6:return "friday";
		case 7:return "sunday";
		default : return "invalid input";
		}
	}
}
