package Col_1;

public class Student {
	private String name;
	private int rollNo;
	private String section;
	private boolean isMale;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setRollno(int rollNo) {
		this.rollNo=rollNo;
	}
	public int getRollno() {
		return rollNo;
	}
	public void setSection(String section) {
		this.section=section;
	}
	public String getSection() {
		return section;
	}
	public void setIsMale(boolean isMale) {
		this.isMale=isMale;
	}
	public boolean getIsMale() {
		return isMale;
	}
	public Student(String name,int rollNo,String section,boolean isMale) {
		this.name=name;
		this.rollNo=rollNo;
		this.section=section;
		this.isMale=isMale;
	}
	public String toString() {
		return name+" "+rollNo+" "+section+" "+isMale;
	}

}
