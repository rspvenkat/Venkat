package for2;

public class FindOddEvenCount {
	public static void main(String[]args) {
		int[] nums = new int[6];
		nums[0]=11;
		nums[1]=15;
		nums[2]=14;
		nums[3]=15;
		nums[4]=19;
		nums[5]=23;
		
	int evenCount=0;
	int oddCount=0;
	
	for(int i=0;i<nums.length;i++) {
		if(nums[i]%2==0) {
			evenCount++;
		}
		else { 
			oddCount++;
		}
		}
	System.out.println("is even "+evenCount);
	System.out.println("is odd "+oddCount);
		
		
	}

} 
