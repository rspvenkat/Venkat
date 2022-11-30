package for1;

public class Average {
	public static void main(String[]args) {
		int total=0;
		int count=0;
		for(int i=1;i<=10;i++) {
			total=total+i;
			count++;
		}
		int avg=total/count;
		System.out.println(avg); 
	}

}
