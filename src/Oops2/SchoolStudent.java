package Oops2;

public class SchoolStudent extends Student{
	public String mark(int num,int num1,int num2,int num3) {
		return "Total mark"+(num+num1+num2+num3);
	}
	public String rank(String grade) {
		return "rank is "+grade;
	}
	public String average(int num,int num1,int num2,int num3,int num4) {
		return "average is "+(num+num1+num2+num3+num4)/5;
	}
	public String name(String name) {
		return "name is "+name;
	}

}
