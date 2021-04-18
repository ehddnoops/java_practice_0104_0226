package chap12;

public class Calculator {
	
	private int memeory;

	public int getMemeory() {
		return memeory;
	}

	public void setMemeory(int memeory) {
		this.memeory = memeory;
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
	
	}
	System.out.println(Thread.currentThread().getName()+"    "+this.memeory);
	}

}
