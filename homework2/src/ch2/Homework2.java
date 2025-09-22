package ch2;

import java.util.Random;
import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("========Q1========");
		System.out.println("몇 마리 드시나요?");

		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.println("치킨 " + i + "마리 주문이요.");
		}

		
//		System.out.println("========Q2=========");
//		System.out.println("스쿼트 몇 번 할까요?");
//
//		int many = sc.nextInt();
//		for (int i = 1; i <= many; i++) {
//			System.out.println("스쿼트 " + i + "회 완료");
//		}
//		System.out.println("오늘 운동 끝");
		
		
		System.out.println("========Q2========");
		System.out.println("스쿼트 몇 번 할까요?");

		int many = sc.nextInt();
		int n = 1;
		
		while (n<=many) {
			System.out.println("스쿼트 " + n + "회 완료");
			n++;
		}
		System.out.println("오늘 운동 끝!");
		

		
		System.out.println("========Q3========");
		System.out.println("숫자를 입력하세요.");
		
		int number = sc.nextInt();
		
		for (int i = 1; i <= number; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		
		System.out.println("========Q4========");
		System.out.println("첫 번째 숫자를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("두 번째 숫자를 입력하세요.");
		int num2 = sc.nextInt();
		
		if (num1>num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		if(num1==num2) {
			System.out.println("출력할 숫자가 없습니다.");
		}
		for(int i = num1; i < num2; i++) {
			System.out.println(i);
		}
		
		
		System.out.println("========Q5========");
		
		int i = 3;
		for(int j = 1; j <= 9; j++) {
			System.out.println(i + " * " + j + " = " + (i*j));
		}
		
		
		System.out.println("========Q6========");
		
		System.out.println("구구단을 외자");
		int number1 = sc.nextInt();
		System.out.println("=====" + number1 + "단=====");
		for(int j = 1; j <= 9; j++) {
			System.out.println(number1 + " * " + j + " = " + (number1*j));
		}
		
		
		System.out.println("========Q7========");
		System.out.println("3의 배수일 때만 점프!");
		
		int jump = sc.nextInt();
		
		for(i=1; i<=jump; i++) {
			if(i%3 ==0) {
				System.out.println("점프!");
			} else {System.out.println("패스");}
		}
		
		
		System.out.println("========Q8========");
		System.out.println("별을 출력해봅시다.");
		
		int star = sc.nextInt();
		
		for(int j = 1; j <= star; j++) {
			for (int h = 1; h <= star; h++) {
				System.out.print("*");
			}
			System.out.println();}
			
			
		System.out.println("========Q9========");
		System.out.println("피자를 나눠보아요.");
		
		System.out.println("피자는 몇 조각?");
		int pizza1 = sc.nextInt();
		System.out.println("사람은 몇 명?");
		int pizza2 = sc.nextInt();
		
		System.out.println("한 사람 당 " + (pizza1/pizza2) +" 조각 먹을 수 있습니다.");
		System.out.println((pizza1%pizza2) + " 조각이 남습니다.");
		
		
		
		
		
		System.out.println("========Q10========");
		System.out.println("주사위의 합을 구해봅시다.");
		
		
		
		int dice1 = (int) (Math.random() * 6) + 1;
		int dice2 = (int) (Math.random() * 6) + 1;
		System.out.println("첫 번째 주사위: " + dice1);
		System.out.println("두 번째 주사위: " + dice2);
		System.out.println("두 수의 합: " + (dice1+dice2));
		
		
		Random rand = new Random();
		
		/*
		 * 
		 * int dice1 = rand.nextInt(6);
		 * int dice2 = rand.nextInt(7);
		 * 
		 * System.out.println("첫 번째 주사위: " + dice1);
		 * System.out.println("두 번째 주사위: " + dice2);
		 * System.out.println("두 수의 합: " + (dice1+dice2));
		 * 
		 */
		
		
		
		System.out.println("========11========");
		
		System.out.println("숫자를 맞혀보아요.");
		int answer = (int) (Math.random() * 50) + 1;
		
		while (true) {
			int try1 = sc.nextInt();
			if(try1>50) {
				System.out.println("범위 내 숫자를 입력해주세요.");
				continue;
				}
			if(try1==answer) {
				System.out.println("정답입니다!");
				break;
			}
			if(try1>answer) {
				System.out.println("Down");
			} else if(try1<answer) {
				System.out.println("Up");
			}
		}
		
	}

}
