package for2;

public class PrintForward {
	public static void main(String[]args) {
		int[] nums= {10,20,30,40,50,60,70,80};
		for(int i=0;i<nums.length;i++) {
		System.out.println(nums[i]);
		
	}
		
		for(int i=nums.length-1;i>=0;i--) {
			System.out.println(nums[i]);
		}
		

}}
