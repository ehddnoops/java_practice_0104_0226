package chapter8.InterfacePolymorphism;

public class Car {
//	Tire fL= new HankookTire();
//	Tire fR= new HankookTire();
//	Tire bL= new HankookTire();
//	Tire bR= new HankookTire();

	Tire tires[]= {new HankookTire(),new HankookTire(),new HankookTire(),new HankookTire()};
	
	
	void run() {
//		fL.roll();
//		fR.roll();
//		bL.roll();
//		bR.roll();
		for(Tire tire:tires) {
			tire.roll();
		}
		
		
	}
}
