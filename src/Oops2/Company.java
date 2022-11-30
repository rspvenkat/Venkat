package Oops2;

public class Company {
	private int numberOfemployeee;
    private String location;
    private String name;
    
    public void setNumberOfemployeee(int numberOfemployeee ) {
    	this.numberOfemployeee=numberOfemployeee;
    }
    public int getNumberOfemployeee() {
    	return numberOfemployeee;
    }
    public void setLocation(String location) {
    	this.location=location;
    }
    public String getLocation() {
    	return location;
    }
    public void setName(String name) {
    	this.name=name;
    }
    public String getName() {
    	return name;
    }
    
    public Company(int numberOfemployeee,String location,String name) {
    	this.numberOfemployeee=numberOfemployeee;
    	this.location=location;
    	this.name=name;
    }
    public String toString() {
    	return numberOfemployeee+" "+location+" "+name;
    }
   

}
