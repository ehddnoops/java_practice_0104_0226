package chap12.threadEx;

public class JoinEx {
	public static void main(String[] args) {
		
		SumThread sumThread = new SumThread();
		
		sumThread.start();
		try {
			sumThread.join();
		} catch (InterruptedException e) {
		
		}
		System.out.println(sumThread.getSum());
	}

}
