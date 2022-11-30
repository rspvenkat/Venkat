package Functioncall;

public class UseCars {
	public static void main(String[]args) {
		Cars cc=new Cars();
		System.out.println(cc.findTaxAmount(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
	}

}
