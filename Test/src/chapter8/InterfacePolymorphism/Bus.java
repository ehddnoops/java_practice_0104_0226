package chapter8.InterfacePolymorphism;

public class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("버스달림");
	}
	public void checkFare() {
		System.out.println("승차요금체크");
	}
	
}
