package chapter9.annonymous;

import chapter9.annonymous.Button.OnClickListener;

public class Window {
	
	Button btn1=new Button();
	Button btn2=new Button();
	
	
//	Button.OnClickListener = new Button.OnClickListener() {
//		
//	};
	
	OnClickListener listener = new OnClickListener() {

		@Override
		public void onClick() {
			System.out.println("전화 검");			
		}};
	
		
		
		Window(){
			btn1.setOnClickListener(listener);
			btn2.setOnClickListener(
					new OnClickListener() {

						@Override
						public void onClick() {
						System.out.println("메세지 보내기");
						}
						
					}
					
					);
		}

}
