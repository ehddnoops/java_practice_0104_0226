package chap12;

public class BeepPrintEx3 {
	public static void main(String[] args) {
		
	
	Thread thread = new BeepThread();
	thread.start();
	for (int i = 0; i < 5; i++) {
		System.out.println("��");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		
		}
	
	
	
	}
}
