
public class Car6 {
	int speed;
	
	void run() {
		System.out.println(speed+"으로 달림");
	}
	public static void main(String[] args) {
		Car6 myCar = new Car6();
		myCar.speed = 50;
		myCar.run();
	}

}
