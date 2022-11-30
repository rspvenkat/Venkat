package Functioncall;

public class Algebra {
	public String findlhsrhs(int a,int b) {
		if((a+b)*(a+b)==(a*a+b*b+2*a*b)){
			return "LHS=RHS";
		}
		else {
			return "Not equal";
		}
	}

}
