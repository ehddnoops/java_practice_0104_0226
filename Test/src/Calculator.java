
public class Calculator {
	int plus(int x, int y) {
		int res = x+y;
		return res;
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		double res = sum/2;
		return res;
	}
	
	
	void execute() {
		double res = avg(7,10);
		System.out.println("°á°ú"+res);
	}
	
	void println(String message) {
		System.out.println(message);
	}

}
