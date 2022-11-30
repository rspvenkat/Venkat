package Oops3;

public abstract class CentralGorvermentRules implements NumberplateRules{
	public void DisplayFontStyle(String style) {
		System.out.println(style);
	}
	public int DisplayFontSize(int size) {
		return size;
	}
	public void DisplayNumberPlateColor(String vechileType) {
		if(vechileType.equalsIgnoreCase("private vechile")) {
			System.out.println("black and white");
		}
		else if(vechileType.equalsIgnoreCase("public vechile")) {
			System.out.println("black and yellow");
		}
		else if(vechileType.equalsIgnoreCase("elctric")) {
			System.out.println("green and white");
		}
		else {
			System.out.println("invalid");
		}
	}
	public void DisplayStateCode(String stateCode) {
		System.out.println(stateCode);
	}
	public abstract boolean isFrame(boolean name);
		


}
