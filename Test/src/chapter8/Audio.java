package chapter8;

public class Audio implements RemoteControl, RemoteControl2 {

	private int volume;
	private boolean mute;

	@Override
	public void turnOn() {
		System.out.println("�����Ŵ");
	}

	@Override
	public void turnOff() {
		System.out.println("�������");
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
		System.out.println("���� TV ����" + this.volume);

	}

	@Override
	public void setMute(boolean mute) {

		this.mute = mute;
		if (mute) {
			System.out.println("����� ����ó��");
		} else {
			System.out.println("��������");

		}
	}

}
