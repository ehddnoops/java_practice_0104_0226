package chapter8;

public class RemoteControlEx2 {
	public static void main(String[] args) {
		
		RemoteControl rc = new RemoteControl() {
			public void turnOn() {}
			public void turnOff() {}
			public void setVolume(int volume) {}
		};
		
		RemoteControl rc2 = new RemoteControl() {
			public void turnOn() {}
			public void turnOff() {}
			public void setVolume(int volume) {}
		};
		
	}

}
