package Oops2;

public class MensHostel extends Hostel{
	boolean isGym;
	int noOfRoommate;
	int foodTimePerDay;
	
	public MensHostel(int rent,boolean Wifi,int onOfRooms,boolean isGym,int noOfRoommate,int foodTimePerDay) {
		super(rent,Wifi,onOfRooms);
		this.isGym=isGym;
		this.noOfRoommate=noOfRoommate;
		this.foodTimePerDay=foodTimePerDay;
	}
	public String toString() {
		return super.toString()+" "+isGym+" "+noOfRoommate+" "+foodTimePerDay;
	}

}
