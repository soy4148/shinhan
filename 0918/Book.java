package ch5;

public class Book {
	
	private String title;
	private String author;
	private int price;
	
	
	public Book () {}
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public void showInfo() {
		System.out.println("제목: " + title);
		System.out.println("저자: " + author);
		System.out.println("가격: " + price);
	}

	
	
	
}
