package chapter8;

public class Television implements RemoteControl, RemoteControl2 {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Æ¼ºñÅ´");
	}

	@Override
	public void turnOff() {
		System.out.println("Æ¼ºñ²û");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("ÇöÀç TV º¼·ý" + this.volume);
	}

}
