package chap12;

public class ThreadNameEx {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName());
	
		ThreadA2 threadA=new ThreadA2();
		
		System.out.println("작업스레드" + threadA.getName());
	
	
	}

}
