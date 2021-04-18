package chap12;

public class ThreadA2 extends Thread{
	
	
	public ThreadA2(){
		setName("ThreadA2");
	}

	@Override
	public void run() {
	
		for (int i = 0; i < 2; i++) {
			System.out.println(getName()+"가 출력한 내용");
		}
	}
}
