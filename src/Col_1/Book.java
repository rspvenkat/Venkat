package Col_1;

public class Book {
	private String author;
	private int noOfpage;
	private int price;
	private boolean isStorybook;
	public void setAuthor(String author) {
		this.author=author;
	}
	public String getAuthor() {
		return author;
	}
	public void setNoOfPage(int noOfpage) {
		this.noOfpage=noOfpage;
	}
	public int getNoOfPage() {
		return noOfpage;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setIsStorybook(boolean isStorybook) {
		this.isStorybook=isStorybook;
	}
	public boolean getIsStorybook() {
		return isStorybook;
	}
	public Book(String author,int noOfpage,int price,boolean isStorybook) {
		this.author=author;
		this.noOfpage=noOfpage;
		this.price=price;
		this.isStorybook=isStorybook;
	}
	public String toString() {
		return "book"+author+" "+noOfpage+" "+price+" "+isStorybook;
	}

}
