package chapter8.InterfacePolymorphism;

public class VehicleEx {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFare();
		
		Bus bus = (Bus) vehicle;
		bus.checkFare();
		
		Driver dr = new Driver();
		dr.drive(bus);
		
	}

}
