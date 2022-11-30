package Functioncall;

public class UseAverage {
	public static void main(String[]args) {
		Average av=new Average();
		System.out.println(av.average(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2])));
	}

}
