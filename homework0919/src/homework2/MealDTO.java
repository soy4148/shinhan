package homework2;

public class MealDTO {

	private int ingred;
	private String name;
	private int num;
	private String date;
	
	
	public MealDTO() {}
	
	public MealDTO(int ingred, String name, int num, String date) {
		super();
		this.ingred = ingred;
		this.name = name;
		this.num = num;
		this.date = date;
	}
	
	public int getIngred() {
		return ingred;
	}
	public void setIngred(int ingred) {
		this.ingred = ingred;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "식자재 번호: " + ingred + ", 식자재명: " + name + ", 수량: " + num + ", 등록날짜: " + date;
	}
	
	
	
	
}
