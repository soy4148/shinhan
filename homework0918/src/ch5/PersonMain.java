package ch5;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {

		Person[] people = new Person[5];
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.println("이름과 나이를 입력하세요.");
		
		for(int i=0; i < people.length; i++) {
			people[i] = new Person();
			
			name = sc.nextLine();
			people[i].setName(name);
			
			age = sc.nextInt();
			people[i].setAge(age);
			
			name = sc.nextLine();
		}
		
		
		System.out.println("이름: " + people[0].getName() + ", "
				+ "나이: " + people[0].getAge());
		
		
		
	}

}
