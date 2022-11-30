package for1;

public class Vowels {
	public static void main(String[]args) {
		String word="venkatesh";
		for(int i=0;i<=word.length()-1;i++) {
		if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u') {
			System.out.println(word.charAt(i)+" is vowel");
		}
		else {
			System.out.println(word.charAt(i)+" is not vowel");
		}
	}
		
			
		}

}
