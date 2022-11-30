package Oops3;

public class UseTamilNaduRules {
	public static void main(String[]args) {
		TamilNaduRules tn=new TamilNaduRules();
		tn.DisplayFontStyle("times new roman");
		tn.DisplayStateCode("tn");
		tn.DisplayNumberPlateColor("private vechile");
		System.out.println(tn.DisplayFontSize(10));
		System.out.println(tn.isFrame(true));
		
	}

}
