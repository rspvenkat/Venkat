package Col_3;

public class Book {
	private String author;
	private int price;
	private int noOfPage;
	private String name;
	
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public int getNoOfPage() {
		return noOfPage;
	}
	public String getName() {
		return name;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setNoOfPage(int noOfPage) {
		this.noOfPage = noOfPage;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Book(String author, int price, int noOfPage, String name) {
		this.author = author;
		this.price = price;
		this.noOfPage = noOfPage;
		this.name = name;
	}
	public String toString() {
		return author+" "+price+" "+noOfPage+" "+name;
	}
}
	
	
	
	
	

