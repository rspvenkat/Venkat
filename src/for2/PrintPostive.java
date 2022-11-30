package for2;

public class PrintPostive {
	public static void main(String[]args) {
		int[] num=new int[8];
		num[0]=1;
		num[1]=15;
		num[2]=-20;
		num[3]=25;
		num[4]=-15;
		num[5]=-30;
		num[6]=80;
		num[7]=-50;
		
		int count=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]>0) {
			System.out.println(num[i]);
			count++;
			}
				
		}
		System.out.println(count);
	}

}
