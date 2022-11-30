package Oops2;

public class Movie {
	public String rating(int fightsc) {
		if(6<fightsc) {
			return "good movie";
		}
		else if(5<fightsc) {
			return "average movie";
		}
		else if(3<fightsc) {
			return "below average";
		}
		else {
			return "bad movie";
		}
	}

}
