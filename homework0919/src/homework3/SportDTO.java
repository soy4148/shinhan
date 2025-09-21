package homework3;

public class SportDTO {
	private String name;
	private int num;
	private int kcal;
	private int ckcal;

	public SportDTO() {}

	public SportDTO(String name, int num, int kcal, int ckcal) {
		this.name = name;
		this.num = num;
		this.kcal = kcal;
		this.ckcal = ckcal;
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

	public int getKcal() {
		return kcal;
	}

	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

	public int getCkcal() {
		return ckcal;
	}

	public void setCkcal(int ckcal) {
		this.ckcal = ckcal;
	}

	@Override
	public String toString() {
		return "화원명: " + name + ", 회원번호: " + num + ", 기준칼로리: " + kcal + ", 소비칼로리: " + ckcal;
	}
	
	
	
	
	
}
