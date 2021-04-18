package chap12;

import java.awt.Toolkit;

public class BeepPrintEx2 {
	public static void main(String[] args) {
		
//		BeepTask bt = new BeepTask();
//		
//		Thread thread = new Thread(bt);
//		
//		thread.start();
		////////////////////////////////////////
//		Thread thread =new Thread(new Runnable() {
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for (int i = 0; i < 5; i++) {
//					toolkit.beep();
//					
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//					
//					}
//				}
//				
//			}
//		});
//////////////////////////////////////
		Thread thread = new Thread( () -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				toolkit.beep();
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				
				}
			}
			
		}
				
				);
		

		 for (int i = 0; i < 5; i++) {
			System.out.println("¶ò");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
	}

}
