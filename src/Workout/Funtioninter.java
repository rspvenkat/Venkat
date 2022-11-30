package Workout;

public class Funtioninter implements sayable {
	public void say(String msg) {
		System.out.println(msg);
	}
	public static void main(String[] args) {
		Funtioninter ex =new Funtioninter();
		ex.say("hai");
	}
	@Override
	public void sayhi(String msg) {
		// TODO Auto-generated method stub
		
	}
	
}
