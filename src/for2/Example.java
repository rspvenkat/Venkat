package for2;

public class Example {
	public static void main(String[] args) {
		String a="ABCaBc123@hmail.com";
		int uCount=0;
		int lCount=0;
		int nCount=0;
		int sCount=0;
		char []b=a.toCharArray();
		for(int i=0;i<b.length;i++) {
			if(b[i]>='A' && b[i]<='Z') {
				uCount=uCount+1;
			}
		
			else if(b[i]>='a' && b[i]<='z') {
			lCount=lCount+1;
		}
		else if(b[i]>='0' && b[i]<='9') {
			nCount=nCount+1;
		}
		else {
		sCount=sCount+1;	
		}
		}
		System.out.println(uCount+" "+lCount+" "+nCount+" "+sCount);
	}

}
