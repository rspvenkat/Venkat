package Col_3;

public class Student {
	private String name;
	private int age;
	private String gender;
	private int rollno;
	private int percentage;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	public Student(String name, int age, String gender, int rollno, int percentage) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.rollno = rollno;
		this.percentage = percentage;
	}
	public String toString() {
		return name+" "+age+" "+gender+" "+rollno+" "+percentage ;
	}
	
	
	

}
