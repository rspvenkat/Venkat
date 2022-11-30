package Oops2;

public class Addition {//overloading
	public String add(int num,int num1) {
		return "Add value is"+(num+num1);
	}
	public String add(int num,float num1) {
		return "Add value is"+(num+num1);
	}
	public String add(float num,float num1) {
		return "Add value is"+(num+num1);
	}
	public String add(int num,int num1,int num2) {
		return "Add value is"+(num+num1+num2);
	}

}
