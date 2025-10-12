package travel;

public class TravelDTO {
/*
	계절(예: “봄”, “여름”, “가을”, “겨울”)을 입력하면 
	해당 계절에 추천되는 여행지 중 
	평점(rating)이 4.5점 이상인 곳의 이름, 위치, 평점 정보를 모두 화면에 출력하는 프로그램 만들기
*/
	
	private int id;
	private String name;
	private String location;
	private double rating;
	private String season;
	
	public TravelDTO() {}

	// 출력용
	public TravelDTO(int id, String name, String location, double rating, String season) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.rating = rating;
		this.season = season;
	}

	public int getId() {
		return id;
	}
	// 질문: setId같은 메서드는 필요없는거 아닌가? / 출력만 하는 프로그램이니까 다른 set 메서드도 필요없는거 아닌가

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public double getRating() {
		return rating;
	}

	public String getSeason() {
		return season;
	}

	@Override
	public String toString() {
		return String.format("번호: %d, 이름: %s, 위치: %s, 평점: %.1f, 추천 시기: %s", id, name, location, rating, season);
	}
	
	
	
	
	
}
