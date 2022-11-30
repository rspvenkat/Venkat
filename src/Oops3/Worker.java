package Oops3;

public abstract class Worker {
	int id;
	int salaryPerHour;
	int workingHourPerDay;
	String name;
	String job;
	public abstract int calculatePerDaySalary(int salaryPerHour,int workingHourPerDay);
	public abstract void jobDeserption(String job);

}
