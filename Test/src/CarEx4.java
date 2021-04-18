
public class CarEx4 {
	public static void main(String[] args) {
		Car4 myCar = new Car4();
		myCar.setgas(5);
		
		boolean gasState = myCar.isLeftGas();
		
		if(gasState) {
			System.out.println("√‚πﬂ");
			myCar.drive();
		}
	}

}
