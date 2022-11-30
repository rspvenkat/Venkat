package Oops2;

public class HCL extends Company {
	private boolean isMnc;
	int noOfFloors;
	String sector;
	
	public void setIsmnc(boolean isMnc) {
		this.isMnc=isMnc;	
	}
	public boolean getIsmnc() {
		return isMnc;
	}
	public void setNoofFloors(int noOfFloors) {
		this.noOfFloors=noOfFloors;
	}
	public int getNoofFloors() {
		return noOfFloors;
	}
	public void setSector(String sector) {
		this.sector=sector;
	}
	public String getSector() {
		return sector;
	}
	public HCL(int numberOfemployee,String location,String name,boolean isMnc,int noOfFloors,String sector) {
		super( numberOfemployee,location,name);
		this.isMnc=isMnc;
		this.noOfFloors=noOfFloors;
		this.sector=sector;
	}
	public String toString() {
		return super.toString()+" "+isMnc+" "+noOfFloors+" "+sector;
		
	}
	
	
	

}
