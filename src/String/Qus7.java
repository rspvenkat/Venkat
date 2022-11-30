package String;

public class Qus7 {
	public static void main(String[]args) {
		String name="java,PYTHON,C++";
		String [] ans=name.split(",");
		int anslength1=ans[0].length();
		int anslength2=ans[1].length();
		int anslength3=ans[2].length();
		
		System.out.println(anslength1);
		System.out.println(anslength2);
		System.out.println(anslength3);
		
		String anslower1=ans[0].toLowerCase();
		String anslower2=ans[1].toLowerCase();
		String anslower3=ans[2].toLowerCase();
		System.out.println(anslower1);
		System.out.println(anslower2);
		System.out.println(anslower3);


		

		
		


		
		
		
	}

}
