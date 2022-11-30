package Oops3;

public abstract class Gold implements Ornaments {
	public void calprice(int wasteage,int price,int makingcharge) {
		int waste=price*wasteage/100;
		System.out.println(waste+makingcharge+price);
	}
	public abstract void polishTime(int karat);

}
