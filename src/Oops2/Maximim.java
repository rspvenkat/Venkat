package Oops2;

public class Maximim {
	public String max(int a,int b) {
		if(a>b) {
			return "Is max"+a;
		}
		else {
			return "is max"+b;
		}	
	}
	public String max(String a,String b) {
		if(a.length()>b.length()) {
			return "is max"+a;
		}
		else {
			return "is max"+b;
		}
	}
	public String max(int a,int b,int c) {
		if(a>b&&a>c) {
			return "Max "+a;
		}
		else if(b>a&&b>c) {
			return "Max "+b;
		}
		else {
			return "Max "+c;
		}
	}

}
