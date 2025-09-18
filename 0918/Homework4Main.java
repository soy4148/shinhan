package ch5;

public class Homework4Main {

	public static void main(String[] args) {

		Homework4 box = new Homework4("abc123");
		
		box.setPassword("abc123");
		System.out.println("내 비밀번호는 "+box.getPassword());
	}

}
