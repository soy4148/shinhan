package homework1;

public class HospitalDTO {

	
	private String id;
	private String pname;
	private String aname;
	private int age;
	private int pnum;
	
	public HospitalDTO() {}
	
	public HospitalDTO(String id, String pname, String aname, int age, int pnum) {
		this.id = id;
		this.pname = pname;
		this.aname = aname;
		this.age = age;
		this.pnum = pnum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPnum() {
		return pnum;
	}

	public void setPnum(int pnum) {
		this.pnum = pnum;
	}

	@Override
	public String toString() {
		return "아이디: " + id + ", 보호자명: " + pname + ", 반려동물 이름: " + aname + ", 반려동물 나이: " + age + ", 연락처: " + pnum;
	}
	
	
	
	
}
