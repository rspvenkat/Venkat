package conditions;

public class StudentGrade {
	public static void main(String[]args) {
		int mark=98;
		if (mark>90&&mark<=100) {
			System.out.println("A Grade");
		}
		else if(mark>80&&mark<=90) {
			System.out.println("B grade");
		}
		else if(mark>70&&mark<=80) {
			System.out.println("C grade");
		}
		else if(mark>60&&mark<=70) {
			System.out.println("D grade");
		}
		else if(mark>50&&mark<=60) {
			System.out.println("E grade");
		}
		else if(mark<=50) {
			System.out.println("fail");
		}
		else
			System.out.println("Invaild");
	}

}
