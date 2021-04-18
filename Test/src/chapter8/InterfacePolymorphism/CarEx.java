package chapter8.InterfacePolymorphism;

public class CarEx {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
//		myCar.fL = new KumhoTire();
//		myCar.fR = new KumhoTire();
		
		myCar.tires[0]=new KumhoTire();
		myCar.tires[1]=new KumhoTire();
		myCar.tires[2]=new KumhoTire();
		
		
		myCar.run();
	}

}
