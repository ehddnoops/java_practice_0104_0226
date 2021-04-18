package chapter6;

public class Car {
	
	private int speed;
	private boolean stop;
	
	public int getSpeed() {
		return speed;
	}
	
	
	public void setSpeed(int speed) {
		if(speed <0 ) {
			this.speed = 0;
		}
		else {
		this.speed = speed;

		}
	}
	
	public boolean isStop() {
		return stop;
		
		
	}
	
	void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
	
	
	
	
	
}
