package Oops2;

public class Hostel {
	int rent;
	boolean isWifi;
	int onOfRooms;
	
	public Hostel(int rent,boolean isWifi,int onOfRooms) {
		this.rent=rent;
		this.isWifi=isWifi;
		this.onOfRooms=onOfRooms;
	}
	public String toString() {
		return rent+" "+isWifi+" "+onOfRooms;
	}

}
