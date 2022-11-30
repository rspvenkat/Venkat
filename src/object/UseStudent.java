package object;

public class UseStudent {
	public static void main(String[]args) {
		Student student1=new Student();
		student1.name="venkat";
		student1.rollNumber=10;
		student1.tamilMark=59;
		student1.englishMark=55;
		student1.scienceMark=60;
		student1.mathsMark=55;
		student1.socialMark=55;
		student1.totalMark=(student1.tamilMark+student1.englishMark+student1.mathsMark+student1.scienceMark+student1.socialMark);
		student1.average=(student1.totalMark/5);
		
		Student student2=new Student();
		student2.name="abdul";
		student2.rollNumber=10;
		student2.tamilMark=55;
		student2.englishMark=55;
		student2.scienceMark=80;
		student2.mathsMark=85;
		student2.socialMark=65;
		student2.totalMark=(student2.tamilMark+student2.englishMark+student2.mathsMark+student2.scienceMark+student2.socialMark);
		student2.average=(student2.totalMark/5);
	}

}
