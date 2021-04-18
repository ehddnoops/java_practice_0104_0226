package chapter7;

public abstract class Phone {

	public String Owner;

	public Phone(String owner) {
		
		this.Owner = owner;
	}
	public void turnOn() {
		System.out.println("On");
	}
	public void turnOff() {
		System.out.println("Off");
	}
	
	
}
