package for2;

public class Oddorevenpac {
	public static void main(String[] args) {	
		int[] num= {50,22,66,41,51,99};
		int evencount=0;
		int oddcount=0;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				evencount++;
				//System.out.println(evencount);

			} 
			else {
				oddcount++;
			}
				
		}
		System.out.println(evencount);
		System.out.println(oddcount);
		
	}

}
