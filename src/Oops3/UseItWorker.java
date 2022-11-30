package Oops3;

public class UseItWorker {
	public static void main(String []args) {
		ItWorker it=new ItWorker();
		int id=101;
		int salaryPerHour=100;
		int workingHourPerDay=8;
		String name="venkat";
		String job="t"
				+ "esting";
		System.out.println(it.calculatePerDaySalary(salaryPerHour, workingHourPerDay));
		it.jobDeserption(job);
	}

}
