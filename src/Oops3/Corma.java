package Oops3;

public class Corma extends AirConditioner {
	public  void inverterType() {
		System.out.println("AC");
	}
	public String airConditionType(String Type) {
		if(Type.equalsIgnoreCase("intverer")) {
			return "it is inverterType AC";
		}
		else {
			return "it is non inverterType AC";
		}
	}
	

}
