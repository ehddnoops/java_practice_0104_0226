package chapter9;

public class Button {
	OnClickListener listener;
	
	
	void setOnClickListener(OnClickListener listener){
		this.listener =listener;
		
	}
	void touch() {
		listener.onClick();
	}
	
	interface OnClickListener{
		public abstract void onClick();
	}

}
