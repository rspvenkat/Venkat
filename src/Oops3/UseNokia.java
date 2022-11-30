package Oops3;

public class UseNokia {
	public static void main(String[]args) {
		Nokia no=new Nokia();
		System.out.println(no.smartPhoneVerison("android"));
		System.out.println(no.netPrice(1000));
		System.out.println(no.emi(18, 10000));
		no.waterproof();
	}

}
