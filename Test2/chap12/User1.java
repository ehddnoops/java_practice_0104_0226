package chap12;

public class User1 extends Thread{
	private Calculator calculator;
	
	
	public void setCalculator(Calculator calculator){
		this.setName("user1");
	}
@Override
public void run() {
	calculator.setMemeory(100);
	
}
}
