package Oops3;

public abstract class Watch {
	public abstract void watchType();
	public void timeFormat(int timeFormat) {
		if(timeFormat==12) {
			System.out.println("It is 12 hours watch");
		}
		else {
			System.out.println("It is 24 hours watch");
		}
	}

}
