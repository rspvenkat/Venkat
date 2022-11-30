package Exception_handling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckMsg {
	public static void main(String[] args) throws IOException  {
		File e = new File("D:\\greeting.txt");
		FileReader g= new FileReader(e);
		int temp =0;
		while((temp=g.read())!=-1){
			//System.out.print((char)temp);
			System.out.print(temp+" ");
		}
		
		
	}

}
