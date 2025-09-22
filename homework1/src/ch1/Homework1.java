package ch1;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		Q1~2
		
		System.out.println("비밀번호를 입력하세요.");
		String password = sc.nextLine();
		
		if(password.equals("qwer1234") ) {
			System.out.println("비밀번호가 맞아요!");
		} else {
			System.out.println("비밀번호가 틀렸어요!");
		}
		
//		Q3~4
		
		System.out.println("좋아하는 동물을 입력하세요.");
		
		String animal = sc.nextLine();
		
		if(animal.equals("강아지")) {
			System.out.println("멍멍!");
		} else if(animal.equals("고양이")) {
			System.out.println("야옹!");
		} else {
			System.out.println("무슨 동물이야?");
		}
		
		
//		Q5~6
		System.out.println("숫자를 입력하세요.");
		
		int day = sc.nextInt();
		
		if(day == 6 || day == 0) {System.out.println("주말이야!");}
		else {System.out.println("평일이야!");}
		
		
//		Q7
		
		System.out.println("나이 검사기");
		int age = sc.nextInt();
		if (age >= 19) {System.out.println("성인입니다.");}
		else {System.out.println("미성년자입니다.");}
		
		
//		Q8
		System.out.println("오늘 마신 커피 수를 입력하세요.");
		int coffee = sc.nextInt();
		if(coffee == 0) {System.out.println("여긴 어디?😮");}
		else if(coffee >=1 & coffee < 3) {System.out.println("완전 맑은 정신~ 🍀");}
		else {System.out.println("기분 좋은 상태! 😄");}
		
		
		
//		Q9
		System.out.println("홀짝 맞히기!");
		int num = sc.nextInt();
		
		if((num%2)==0) {System.out.println("짝수");} 
		else {System.out.println("홀수");}
		
		
		
	}

}
