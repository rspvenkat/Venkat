package Oops3;

public abstract class Smartphone implements Phone{
	public void call() {
		System.out.println("Incoming");
	}
	public void msgs() {
		System.out.println("hi");
	}
	public abstract void videoCall();
	public abstract void Games();
	

}
