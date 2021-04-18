package chap12;

import java.awt.Toolkit;

public class BeepPrintEx {
	public static void main(String[] args) {
		
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	for (int i = 0; i < 5; i++) {
		toolkit.beep();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		
		}
	}

	
	 for (int i = 0; i < 5; i++) {
		System.out.println("¶ò");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	 
	
	}//end of main

}//end of class
