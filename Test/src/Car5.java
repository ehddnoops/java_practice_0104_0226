
public class Car5 {
	int speed;
	
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("Ű������");
	}
	
	void run() {
		for(int i = 10;i <=50;i+=10) {
			speed = i;
			System.out.println("�ü�"+ speed);
		}
	}

	
	public static void main(String[] args) {
		Car5 mycar = new Car5();
		mycar.keyTurnOn();
		mycar.run();
		int speed = mycar.getSpeed();
		System.out.println("");
	}
}
