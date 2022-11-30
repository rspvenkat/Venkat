package Workout;

public class StaticKey {
	static int a=10;
	int b=10;
	public void find() {
//		a++;
//		b++;
		System.out.println(++a);
		System.out.println(b++);
	}
	public static void main(String[] args) {
		StaticKey s1=new StaticKey();
		StaticKey s2=new StaticKey();
		StaticKey s3=new StaticKey();
		s1.find();
		s1.find();
		s1.find();
		s2.find();
		s2.find();
		s3.find();
	}

}
