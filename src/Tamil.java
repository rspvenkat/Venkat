
public class Tamil {
	public static void main(String[] args) {
		String name="TaMiLArAsU";
		char[] word=name.toCharArray();
		int lcase=0;
		int Ccase=0;
		for(int i=0;i<=word.length;i++) {
			if(name.toLowerCase().equals(word)) {
				lcase++;
			}
		}
		System.out.println(lcase);
	}
}
