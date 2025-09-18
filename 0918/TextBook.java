package ch5;

public class TextBook extends Book {

	String subject;
	
	public TextBook() {}
	
//	public TextBook (String title, String author, int price, String subject) {
//		super(title, author, price);
//		this.subject = subject;
//	}
	
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}
	


	public void showTextBook() {
		showInfo();
		System.out.println("과목: " + subject);
	}
	
	
}
