package Col_3;

public class Employee {
	private String name;
	private int id;
	private int age;
	private int salary;
	private String gender;
	private String designation;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Employee(String name, int id, int age, int salary, String gender, String designation) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
		this.designation = designation;
	}
	public String toString() {
		return name+" "+id+" "+age+" "+salary+" "+gender+" "+designation;
	}
	

}
