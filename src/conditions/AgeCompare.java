package conditions;

public class AgeCompare {
	public static void main(String[]args) {
		int age=19;
		if(age>0&&age<=12) {
			System.out.println("KID");
		}
		else if(age>12&&age<=20) {
			System.out.println("ADULT");
		}
		else {
			System.out.println("invaid data");
		}
			
	}

}
