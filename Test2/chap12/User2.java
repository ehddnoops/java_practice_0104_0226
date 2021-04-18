package chap12;

public class User2 extends Thread{
	private Calculator calculator;
	
	
	public void setCalculator(Calculator calculator){
		this.setName("user2");
	}
@Override
public void run() {
	calculator.setMemeory(150);
	
}
}
