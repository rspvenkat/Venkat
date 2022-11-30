package Col_1;

import java.util.ArrayList;

public class UseBook {
	public static void main(String[]args) {
		Book b1=new Book("james",500,1500,true);
		Book b2=new Book("john",511,5000,false);
		Book b3=new Book("venkat",222,4144,true);
		Book b4=new Book("mark",545,1000,false);
		Book b5=new Book("kumar",444,2520,true);
		
		ArrayList<Book>bk=new ArrayList<>();
		bk.add(b1);
		bk.add(b2);
		bk.add(b3);
		bk.add(b4);
		bk.add(b5);
		
//		for(Book i:bk) {
//			System.out.println(i);
//		}
//		
		int max=b1.getNoOfPage();
		for(int i=0;i<bk.size();i++) {
			if(max<bk.get(i).getNoOfPage()) {
				max=bk.get(i).getNoOfPage();
			}
		}
			System.out.println(max);
			
	
	bk.forEach(x ->{
		if(x.getIsStorybook()==true) {
			System.out.println(x.getAuthor()+"is storybook");
		}
		else {
			System.out.println(x.getAuthor()+" is not storybook");
		}
	   });
	}
	

}
