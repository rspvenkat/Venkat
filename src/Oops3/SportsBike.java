package Oops3;

public class SportsBike implements Bike {
	public int speed() {
		return 150;
	}
	public String mileage(String fuel) {
		if(fuel.equalsIgnoreCase("pertol")) {
			return "The mileage is 50";
	}
		else {
			return "The mileage is 100";
		}

}
}
