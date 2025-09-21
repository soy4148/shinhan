package homework1;

import java.util.List;
import java.util.Scanner;

public class HospitalController {

	Scanner sc = new Scanner(System.in);
	private HospitalService service;
	
	public HospitalController(HospitalService service) {
		this.service = service;
	}
	
	public void run() {
		while(true) {
			System.out.println("번호를 입력하세요.");
			System.out.println("1. 등록");
			System.out.println("2. 조회");
			System.out.println("3. 종료");
			int q = sc.nextInt();
			sc.nextLine();
			
			switch (q) {
			case 1:
				inputpatient();
				System.out.println("등록이 완료되었습니다.");
				
				break;
			case 2:
				for(HospitalDTO dto : service.getAllHos()) {
					System.out.println(dto);
				}
				
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				return;

			default:
				System.out.println("잘못된 입력입니다.");
			}
			
			
			
			}
			
		}
		
		
		
	
	
	void inputpatient() {
		System.out.println("아이디: ");
		String id = sc.nextLine();
		System.out.println("보호자명: ");
		String pname = sc.nextLine();
		System.out.println("반려동물 이름: ");
		String aname = sc.nextLine();
		System.out.println("반려동물 나이: ");
		int age = sc.nextInt();
		System.out.println("연락처: ");
		int pnum = sc.nextInt();
		
		service.addHospital(id, pname, aname, age, pnum);
	}
	
	
}
