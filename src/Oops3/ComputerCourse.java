package Oops3;

public class ComputerCourse implements Course {
	public void courseName(String courseName) {
		System.out.println("course name is "+courseName);
	}
	public String trainerName(String trainerName) {
		return "trainer name is "+trainerName;
	}
	public int CourseFees(String courseName) {
		if(courseName.equalsIgnoreCase("java")) {
			return 20000;
		}
		else if(courseName.equalsIgnoreCase("python")) {
			return 15000;
		}
		else if(courseName.equalsIgnoreCase("Sql")) {
			return 10000;
		}
		else if(courseName.equalsIgnoreCase("hacking")) {
			return 8000;
		}
		else {
			return 0;
		}
	}




}
