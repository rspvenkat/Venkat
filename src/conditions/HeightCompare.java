package conditions;

public class HeightCompare {
	public static void main(String[]args) {
		int ram=126;
		int ravi=152;
		int arun=128;
		int mani=135;
		if (ram<ravi && ram<arun && ram<mani) {
			System.out.println("ram is short");
		}
		else if(ravi<ram&&ravi<arun && ravi<mani) {
			System.out.println("ravi is short");
		}
		else if(arun<ram&&arun<ravi&&arun<mani) {
			System.out.println("arun is short");
		}
		else {
			System.out.println("mani is short");
		}
			
	}

}
