package chapter8.InterfacePolymorphism;

public class Driver {
	
	public void drive(Vehicle vehicle) {
		if (vehicle instanceof Bus) {
		Bus bus = (Bus)vehicle;
		bus.checkFare();
		}
		vehicle.run();
	}

}
