package conditions;

public class GreetingTime {
	public static void main(String[]args) {
		int time =15;
		if (time>6&&time<=11) {
			System.out.println("Good moring");
		}
		else if(time>12&&time<=15) {
			System.out.println("good aternoon");
		}
		else if(time>16&&time<=19) {
			System.out.println("good evvening");
		}
		else if(time>20&&time<=24) {
			System.out.println("good night");
		}
		else {
			System.out.println("invaid data");
		}
		
	}

}
