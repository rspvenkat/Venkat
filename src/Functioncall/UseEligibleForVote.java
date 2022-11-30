package Functioncall;

public class UseEligibleForVote {
	public static void main(String[] args) {
		EligibleForVote ab=new EligibleForVote();
		System.out.println(ab.findEligibilityForVote(Integer.parseInt(args[0])));
	}

}
