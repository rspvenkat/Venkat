package Oops3;

public abstract class Developer implements Human {
	public void eat(int time) {
		if(time>=8&&time<12) {
			System.out.println("Breakfast");
		}
		else if(time>=12&&time<3) {
			System.out.println("Lunch");
		}
		else if(time>=7&&time<10) {
			System.out.println("dinner");
		}
		else {
			System.out.println("Snacks");
		}
	}
	public void sleep() {
		System.out.println("good night");
	}
	public abstract void salary(int designtion);
	


}
