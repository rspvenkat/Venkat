package conditions;

public class ElseIfLadder {
	public static void main(String[]args) {
		int tamil=89;
		int english=92;
		int maths=99;
		if(tamil>english&&tamil>maths) {
			System.out.println("Tamil is high");
		}
		else if(english>tamil&&english>maths) {
			System.out.println("English is high");
		}
		else if (maths>tamil&&maths>english) {
			System.out.println("maths is high");
		}
		else {
			System.out.println("invaild data");
		}
	}

}
