package homework3;

import java.util.Scanner;

public class SportController {
	Scanner sc = new Scanner(System.in);
	private SportService service;
	
	public SportController(SportService service) {
		this.service = service;
	}
	
	
	
	public void run() {
		while(true) {
			System.out.println("번호를 입력하세요. 1. 등록 / 2. 조회 / 3. 프로그램 종료");
			int q = sc.nextInt();
			sc.nextLine();
			
			switch (q) {
			case 1: {
				System.out.println("이름을 입력하세요:");
				String name = sc.nextLine();
				
				System.out.println("회원번호를 입력하세요:");
				int num = sc.nextInt();
				sc.nextLine();
				
				System.out.println("기준칼로리를 입력하세요:");
				int kcal = sc.nextInt();
				sc.nextLine();
				
				System.out.println("소비칼로리를 입력하세요:");
				int ckcal = sc.nextInt();
				sc.nextLine();
				
				service.addSport(name, num, kcal, ckcal);
				System.out.println("성공적으로 등록되었습니다.");
				break;
			}
			case 2: {
				for(SportDTO dto:service.getAllSport()) {
					System.out.println(dto);
				}
				break;
			}
			case 3: {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			default: System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}
	
}
