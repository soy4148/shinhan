package ch5;

public class Bicycle implements Vehicle {

	private int speed;
	
	
	public Bicycle() {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void move() {
		System.out.println("속도: " + speed);
	}
}
