package Functioncall;

public class UseGpay {
	public static void main(String[]args) {
		Gpay gs=new Gpay();
		System.out.println(gs.moneyTransfer(Integer.parseInt(args[0])));
	}

}
