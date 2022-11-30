package Oops3;

public class ItWorker extends Worker {
	public int calculatePerDaySalary(int salaryPerHour,int workingHourPerDay) {
		return salaryPerHour*workingHourPerDay;
	}
	public  void jobDeserption(String job) {
		if(job.equals("developer")||job.equals("testing")) {
			System.out.println("IT job");
		}
		else {
			System.out.println("non IT");
		}
	}


	

}
