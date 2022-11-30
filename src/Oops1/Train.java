package Oops1;

public class Train {
	private String name;
	private int no;
	private int seatNo;
	private boolean isAc;
	
	public Train(String name,int no,int seatNo,boolean isAc) {
		this.name=name;
		this.no=no;
		this.seatNo=seatNo;
		this.isAc=isAc;
	}
	public String toString() {
		return name+" "+no+" "+seatNo+" "+isAc;
	}
		
	}

	
	

