package Workout;

public class OTP_Generator {
	class GFG{
		 

		static String generateOTP(int len)
		{
		    String str = "abcdefghijklmnopqrstuvwxyzABCD"+"EFGHIJKLMNOPQRSTUVWXYZ0123456789";
		    int n = str.length();
		    String OTP="";
		    for (int i = 1; i <= len; i++)
		        OTP += (str.charAt((int) ((Math.random()*10) % n)));
		 
		    return(OTP);
		}
		 

		public static void main(String[] args) {
		 
		    int len = 6;
		    System.out.printf("Your OTP is - %s", generateOTP(len));
		}
		}

}
