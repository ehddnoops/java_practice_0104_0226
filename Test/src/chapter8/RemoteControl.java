package chapter8;

public interface RemoteControl {

	// ��� �ʵ�
	public int MAX_VOLUME = 10;// public static final�� Ư���� ���� ������, public, static, final �����ϴ��� �ڵ������� ������ ��������
								// �ٰ� �ȴ�.
	public int MIN_VOLUME = 0;

	// �߻� �޼���
	public abstract void turnOn();

	public abstract void turnOff();

	public abstract void setVolume(int volume);

	// ����Ʈ �޼ҵ�
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("���� ó��");
		} else {
			System.out.println("���� ����");
		}
	}

	// ���� �޼���
	static void changeBatterry() {
		System.out.println("������ ��ȯ");
	}

}
