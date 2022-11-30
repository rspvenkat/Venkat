package Functioncall;

public class Checking {
	public String bio(String name,int age)  {
	
		return name+" "+age;
				
	}
	public void num(int a) {
		if(a%2==0) {
			System.out.println(a+"is even");
		}
		else {
			System.out.println(a+"is odd");
		}
		
	}
	
	public void loop(int a) {
		for(int i=0;i<a;i++) {
			System.out.println(i);
		}
	}
	
	public String nums (int a) {
		boolean isprime=true;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
			isprime=false;
			}
		}
			if (isprime==true) {
				return "is prime";
			}
			else {
				return "is not prime";
			}

	
			
		}
	}


