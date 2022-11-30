package Functioncall;

public class Gmail {
	public void getLogin(String mailname,String mailpassword) {
		if(mailname.equalsIgnoreCase("support@onesofts.in")&&mailpassword.equals("onesoft")){
			System.out.println("login success");
		}
		else {
			System.out.println("login failed");
		}
		
	}

}
