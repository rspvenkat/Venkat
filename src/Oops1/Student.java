package Oops1;

public class Student {
	private String name;
	private int id;
	private boolean ismale;
	private Department department;
	
	public Student(String name,int id,boolean ismale,Department department) {
		this.name=name;
		this.department=department;
		this.ismale=ismale;
		this.id=id;
	}
	public String toString() {
		return name+" "+id+" "+ismale+" "+department;
	}

	

}
