package ch5;

public class Novel extends Book {

	String genre;
	
	public Novel() {}
	
	public Novel(String title, String author, int price, String genre) {
		super(title, author, price);
		this.genre = genre;
	}
	
	public void showNovel() {
		showInfo();
		System.out.println("장르: " + genre);
	}
}
