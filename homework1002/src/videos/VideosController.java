package videos;

import java.util.List;
import java.util.Scanner;

public class VideosController {

	Scanner sc = new Scanner(System.in);
	private VideosService service = new VideosService();
	
	
	public void run() {
		/*
		while (true) {
			System.out.println("번호를 입력하세요");
			int q = sc.nextInt();
			switch (q) {
			case 1: getAllVid(); break;

			default: System.out.println("잘못된 입력입니다.");
			return;
			}
		*/
		
		getAllVid();
		
	}


	private void getAllVid() {
		List<VideosDTO> list = service.getAllVid();
		outVidList(list);
	}


	private void outVidList(List<VideosDTO> list) {
		if(list == null || list.isEmpty()) {
			System.out.println("내용 없음");
		} else {
			for(VideosDTO dto:list) {
				System.out.println(dto);
			}
		}
	}

}
