package Workout;

public interface Defaultjava8 {
	public void add(int a);
//	public void mull(int b) {
//		System.out.println(b); we cannot implement method in interface
//	}
	default void mull(int b) {
		System.out.println(b);
	}

}
