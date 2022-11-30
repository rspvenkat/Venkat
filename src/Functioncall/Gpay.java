package Functioncall;

public class Gpay {
	public String moneyTransfer(int money) {
	if(money<100000) {
		return "Transaction Successful";
	}
	else {
		return "Today limit reached";
	}

}
}
