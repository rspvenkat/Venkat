package for2;

public class VowelCount {
	public static void main(String[]args) {
		String[] words= {"sky","wnky","earth","plants","hmm"};
		for(int i=0;i<words.length;i++) {
			if(words[i].contains("a")||words[i].contains("e")||words[i].contains("i")||words[i].contains("o")||words[i].contains("u")) {
	     		System.out.println(words[i]);			
			}
		}
	}
}
