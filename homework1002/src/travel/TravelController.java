package travel;

import java.util.List;
import java.util.Scanner;

public class TravelController {
	
	private TravelService service = new TravelService();
	Scanner sc = new Scanner(System.in);
	
	
	public void run() {
		while (true) {
			getInfo();
		}
	}


	private void getInfo() {
		System.out.println("방문하려는 계절: ");
		String season = sc.nextLine();
		
		List<TravelDTO> list = service.getBySeason(season);
		for(TravelDTO dto : list) {
			if (list == null || list.isEmpty()) {
				System.out.println("데이터가 없습니다.");
				// 다른 계절을 입력했을 때 데이터가 없다는게 출력되지 않아요
			} else {
				System.out.println(dto);
			}
		}
	}
	

}
