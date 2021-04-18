package chapter9;

import chapter9.Button.OnClickListener;

public class CallListener implements OnClickListener{

	@Override
	public void onClick() {
		System.out.println("전화 걸기");
	}
}
