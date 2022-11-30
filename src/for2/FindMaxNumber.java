package for2;

public class FindMaxNumber {
	public static void main(String[]args) {
		int[] num= {5,6,7,9,66,55};
		
		int max=num[5];
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>=max) {
				max=num[i]; 
				
			}
	
		}
		System.out.println(max);
		
		
	}

}
