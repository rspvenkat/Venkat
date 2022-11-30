package Oops1;

public class Department {
	private String branch;
	private int noOfSemeter;
	private boolean isTechnical;
	
	public Department(String branch,int noOfSemeter,boolean isTechnical) {
		this.branch=branch;
		this.noOfSemeter=noOfSemeter;
		this.isTechnical=isTechnical;
	}
	public String toString() {
		return branch+" "+noOfSemeter+" "+isTechnical;
	}

}
                                    