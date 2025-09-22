package ch1;

import java.util.Random;

public class Homework3 {

	
//	Q1
	public static void chicken(int n) {
		System.out.println(n*8);
	}
	
//	Q2
	public static int coffee(int a) {
		return a * 80;
	} 
	
//	Q3
	public static int rice(int n) {
		return n * 200;
	}
	
//	Q4
	public static void name(String a, String b) {
		Random rand = new Random();
		System.out.println(a+"&"+ b + "의 연애 성공확률은? " + rand.nextInt(101) + "%");
	}
//	public static int name() {
//		Random rand = new Random();
//		return rand.nextInt(101);
//	}
	
	
//	Q5
	public static void menu() {
		Random rand = new Random();
		String[] menu = {"라면", "김밥", "파스타", "샐러드"};
		int mymenu = rand.nextInt(menu.length);
		System.out.println(menu[mymenu]);
	}
	
//	public static String menu() {
//		Random rand = new Random();
//		String[] menu = {"라면", "김밥", "파스타", "샐러드"};
//		int mymenu = rand.nextInt(menu.length);
//		return menu[mymenu];
//	}
	
	
//	Q6
	public static String grade(int a) {
		String level;
		if(a>=90) {level = "A";}
		else if(a>=80) {level = "B";}
		else if(a>=70) {level = "C";}
		else if(a>=60) {level = "D";}
		else {level = "F";}
		return level;
	}
	
	
//	Q7
	public static void wage(int a, int b) {
		System.out.println("총 급여: " + (a*b));
	}
	
//	public static int wage(int a, int b) {
//		return a*b;
//	}
	
	
	
	public static void main(String[] args) {

	System.out.println(grade(50));
	}

}
