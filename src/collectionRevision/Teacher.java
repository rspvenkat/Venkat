package collectionRevision;

public class Teacher {
	private String name;
	private int age;
	private int salary;
	private boolean isPermanent;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getSalary() {
		return salary;
	}
	public boolean getIsPermanent() {
		return isPermanent;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setIsPermanent(boolean isPermanent) {
		this.isPermanent = isPermanent;
	}
	public Teacher(String name, int age, int salary, boolean isPermanent) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isPermanent = isPermanent;
	}
	public String toString() {
		return name+" "+age+" "+salary+" "+isPermanent;
	}
	

}
