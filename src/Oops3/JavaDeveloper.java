package Oops3;

public class JavaDeveloper extends Developer {
	public  void salary(int designtion) {
		if(designtion==30000) {
			System.out.println("devolper");
		}
		else if(designtion==25000) {
			System.out.println("tester");
		}
		else if(designtion==45000) {
			System.out.println("TL");
		}
		else if(designtion==80000) {
			System.out.println("HR");
		}
		else {
			System.out.println("Invaild");
		}
	}


}
