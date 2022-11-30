package Exception_handling;

public class Numberformatexce {
	public static void main(String[] args) {
		System.out.println("start");
		try {
			String a="45gba";
			int b = Integer.parseInt(a);
			System.out.println(b);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
