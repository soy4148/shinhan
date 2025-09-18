package ch5;

public class BookMain {
	
	public static void main(String[] args) {

//		제목, 저자, 가격, (과목명/장르)
		
		Book b1 = new Book();
		
		b1.setTitle("이것이 자바다");
		b1.setAuthor("아무개");
		b1.setPrice(30000);
		
		b1.showInfo();
		
		System.out.println("===================");
		
		TextBook b2 = new TextBook();
		b2.setTitle("자바의 세계");
		b2.setSubject("수학");
		b2.setPrice(100000);
		b2.setAuthor("김현정");
		b2.showTextBook();
		
		
//		System.out.println("======TextBook======");
//		
//		TextBook b2 = new TextBook("ㅇ", "ㅇ", 23, "ㅎㅎ");
//		b2.showTextBook();
//
//		System.out.println("======Novel======");
//		
//		Novel b3 = new Novel("롸", "ㅁ", 30, "ㄴㅁㅇ");
//		b3.showNovel();
		
		// getter와 메서드로 출력한다는 말이 무슨말일까요 엉엉
	}

}
