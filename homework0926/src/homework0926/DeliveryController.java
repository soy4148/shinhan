package homework0926;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class DeliveryController {

	/*
	 * 품명입력(자동증가번호, 품명, 가격, 주문가능수, 현재재고(남은 수량))
	 * 전체조회
	 * 개별조회
	 * 삭제
	 * 수정
	 * 통계
	 * 
	 * 
	 */
	
	private DeliveryService service;
	public DeliveryController(DeliveryService service) {
		this.service = service;
	}

	Scanner sc = new Scanner(System.in);

	/*
	 * try - catch를 사용하여 int가 아닌 값을 입력받았을 때의 예외처리를 추가한 사항 정말 좋은 것 같아요!
	 */
	
	public void run() {
		while(true) {			
			System.out.println("번호를 입력하세요.");
			System.out.println("1. 등록 | 2. 전체 조회 | 3. 개별 조회 | 4. 삭제 | 5. 수정 | 6. 분석 | 0. 종료");
			
			int q;
			try {
				q = sc.nextInt();
				sc.nextLine();
			} catch(InputMismatchException e) {
				System.out.println("숫자를 입력해주세요.");
				break;
			}
			switch (q) {
				case 1: addDelivery(); break; //등록
				case 2: outAllDelivery(); break; // 전체 조회
				case 3: outDelivery(); break; // 개별 조회
				case 4: deleteDelivery(); break; // 삭제
				case 5: updateDelivery(); break; // 수정
//				case 6: reportDelivery();break; // 분석
				case 0: System.out.println("프로그램 종료"); return; // 종료
				default: System.out.println("잘못된 입력입니다.");
			}
		}
	}

	
	// 분석
//	private void reportDelivery() {
//		int sum = service.getSumTotal();
//		
//	}

	/*
	 * 지금 출력할 때 System.out.println("변경할 주문명(" + dto.getName() + "): ");의 형태로 출력하고 있는데
	 * 이 경우에는  System.out.printf()를 사용하시는게 더 편할 것 같아요.
	 * -> System.out.println("변경할 주문명(%s): ", dto.getName());
	 * 
	 * 알고 계실 것 같지만 print, println, printf 이렇게 3가지를 사용하고 있는데요.
	 * printf의 경우는 + 의 형식으로 변수를 출력하는게 아닌 출력지정자(%d, %s ...)를 사용하여 출력하기 때문에
	 * 한 줄에 변수가 많을 때 가독성이 좋아지는 것 같아요.
	 * 
	 * + 근데 자바에서는 printf를 별로 안쓴다는 코멘트를 봐서.. 그냥 그렇구나만 해주세요,,,,
	 */

	private void updateDelivery() {
		//수정 번호 받기
		System.out.println("수정할 항목 번호를 입력하십시오.");
		int id = sc.nextInt();
		sc.nextLine();
		DeliveryDTO dto = service.getById(id);
		
		//번호가 없는 경우
		if(dto == null) {
			System.out.println("존재하지 않는 번호입니다.");
		} else {//번호가 있는 경우
			System.out.println("변경할 주문명(" + dto.getName() + "): ");
			String newName = sc.nextLine();
			
			System.out.println("변경할 가격(" + dto.getPrice() + "): ");
			int newPrice = sc.nextInt();
			
			System.out.println("주문 제한 수량 변경(" + dto.getOrder() + "): ");
			int newOrder = sc.nextInt();
			
			System.out.println("재고 변경(" + dto.getTotal() + "): ");
			int newTotal = sc.nextInt();
			
			if(service.editDelivery(id, newName, newPrice, newOrder, newTotal)) {
				System.out.println("수정 완료");
			} else {
				System.out.println("수정 실패");
			}
		}
	}


	private void deleteDelivery() {
		if(service.getDelivery().size()==0) {
			System.out.println("데이터가 없습니다."); 
		} else {
			System.out.println("삭제할 주문 번호를 입력하십시오.");
			int id = sc.nextInt();
			sc.nextLine();
			
			if(service.deleteDelivery(id)) {
				System.out.println("삭제되었습니다.");
			} else {
				System.out.println("해당하는 주문이 없습니다.");
			}
		}
	}

	private void outDelivery() {
		System.out.println("번호를 입력하십시오.");
		int id = sc.nextInt();
		sc.nextLine();
		
		DeliveryDTO dto = service.getById(id);
		
		if(service.getById(id) == null) {
			System.out.println("해당하는 주문이 없습니다.");
		} else {
			System.out.println(dto);
		}
	}

	private void outAllDelivery() {
		List<DeliveryDTO> list = service.getDelivery();
		if(list.isEmpty()) {
			System.out.println("상품이 없습니다.");
		} else {
			for(DeliveryDTO dto : list) {
				System.out.println(dto);
			}
		}
	}

	private void addDelivery() {
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		
		System.out.println("가격을 입력하세요.");
		int price = sc.nextInt();
		
		System.out.println("주문 제한 수량을 입력하세요.");
		int order = sc.nextInt();
		
		System.out.println("재고를 입력하세요.");
		int total = sc.nextInt();
		
		service.addDelivery(name, price, order, total);
		System.out.println("입력 완료");
	}
	
	 
	
	
}
