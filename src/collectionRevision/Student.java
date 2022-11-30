package collectionRevision;

public class Student {
	private String name;
	private int age;
	private String std;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getStd() {
		return std;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public Student(String name, int age, String std) {
		super();
		this.name = name;
		this.age = age;
		this.std = std;
	}
	
	public String toString() {
		return name+" "+age+" "+std;
	}
	

}
