package swtichcase;

public class Calculator {
	public static void main(String[]args) {
		int num1=15;
		int num2=10;
		String operation="add";
		switch(operation){
		case "add":System.out.println(num1+num2);break;
		case "sub":System.out.println(num1-num2);break;
		case "mul":System.out.println(num1*num2);break;
		case "div":System.out.println(num1/num2);break;
		case "mod":System.out.println(num1%num2);break;
		default:System.out.println("ivalid data");
		
			
		}
	}

}
