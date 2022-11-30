package Exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SayHello {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\welcome.txt");
		FileReader ff = new FileReader(f);
		int temp = 0;
		while((temp=ff.read())!=-1) {
			System.out.print(temp+" ");
			
		}
		
	}

}
