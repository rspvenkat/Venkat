package Oops1;

public class Company {
	private String name;
	private String location;
	private boolean isIt;
	private Employee employee;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setLocation(String location) {
		this.location=location;
	}
	public String getLocation() {
		return location;
	}
	public void setIsIt(boolean isIt) {
		this.isIt=isIt;
	}
	public boolean getIsIt() {
		return isIt;
	}
}
