package chap12.threadEx.WaitEx;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA�� methodA() �۾�����");
		notify();
		try {
		wait();
		} catch(InterruptedException e) {
	}

	public void methodB() {
		System.out.println("ThreadB�� methodB() �۾�����");
	}
}
