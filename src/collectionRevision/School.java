package collectionRevision;

public class School {
	private String location;
	private String schoolName;
	private int noOfStaff;
	private int noOfStudent;
	private Teacher teacher;
	private Student student;
	public String getLocation() {
		return location;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public int getNoOfStaff() {
		return noOfStaff;
	}
	public int getNoOfStudent() {
		return noOfStudent;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public Student getStudent() {
		return student;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public void setNoOfStaff(int noOfStaff) {
		this.noOfStaff = noOfStaff;
	}
	public void setNoOfStudent(int noOfStudent) {
		this.noOfStudent = noOfStudent;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public School(String location, String schoolName, int noOfStaff, int noOfStudent, Teacher teacher,
			Student student) {
		super();
		this.location = location;
		this.schoolName = schoolName;
		this.noOfStaff = noOfStaff;
		this.noOfStudent = noOfStudent;
		this.teacher = teacher;
		this.student = student;
	}
	
	public String toString() {
		return location+" "+schoolName+" "+noOfStaff+" "+noOfStudent+" "+teacher+" "+student;
	}
	
	

}
