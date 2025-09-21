package homework2;

import java.util.List;
import java.util.Scanner;

public class MealController {

	
	Scanner sc = new Scanner(System.in);
	private MealService service;
	
	public MealController(MealService service) {
		this.service = service;
	}
	
	
	public void run() {
		while(true) {
			System.out.println("번호 입력: 1. 등록 / 2. 조회 / 3. 프로그램 종료");
			int q = sc.nextInt();
			sc.nextLine();
			
			switch (q) {
			case 1:
				System.out.println("식자재 번호: ");
				int ingred = sc.nextInt();
				sc.nextLine();
				
				System.out.println("식자재명: ");
				String name = sc.nextLine();
				
				System.out.println("수량: ");
				int num = sc.nextInt();
				sc.nextLine();
				
				System.out.println("등록 날짜:");
				String date = sc.nextLine();
				
				service.addMeal(ingred, name, num, date);
				System.out.println("등록이 완료되었습니다.");
				
				break;
			case 2:
				for(MealDTO dto : service.getAllMeal()) {
					System.out.println(dto);
				}
				
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}
}
