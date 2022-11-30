package Oops2;

public class Action extends Movie {
	public String rating(int fightsc) {
		if(9<=fightsc) {
			return "Good";
		}
		else if(6<=fightsc){
			return "Average";
		}
		else if(4<=fightsc) {
			return "below average";
		}
		else {
			return "bad";
		}
		
	}
	
	
	
	
	
	

}
