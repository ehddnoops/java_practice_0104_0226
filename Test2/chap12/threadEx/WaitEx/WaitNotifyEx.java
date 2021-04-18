package chap12.threadEx.WaitEx;

public class WaitNotifyEx {
	public static void main(String[] args) {
		
	
	WorkObject sharedObject = new WorkObject();
	
	ThreadA threadA=new ThreadA(sharedObject);
	ThreadA threadB=new ThreadA(sharedObject);
	
	threadA.start();
	threadB.start();

}
}