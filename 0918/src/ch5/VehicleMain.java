package ch5;

public class VehicleMain {

	public static void main(String[] args) {

		Car v1 = new Car();
		Bicycle v2 = new Bicycle();
		
		v1.setSpeed(50);
		
		v1.move();
		v2.move();
		
		// vehicle로 하면 getspeed 메서드가 없어서 실행이 안되는데 이게 맞나요??? 
		// v1는 Car 클래스에서 / v2는 Bicycle 클래스에서 갖고오는게 맞나요 ㅠㅠ	
		
	
		
	}

}
