package Oops3;

public class UseSize {
	public static void main(String[]args) {
		Size s=new Size ();
		s.printPrice(1000);
		s.modelNote("drawing");
		System.out.println(s.netprice(100, 20));
		s.sizeNote(15);
	}

}
