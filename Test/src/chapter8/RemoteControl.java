package chapter8;

public interface RemoteControl {

	// 상수 필드
	public int MAX_VOLUME = 10;// public static final의 특성을 갖기 때문에, public, static, final 생략하더라도 자동적으로 컴파일 과정에서
								// 붙게 된다.
	public int MIN_VOLUME = 0;

	// 추상 메서드
	public abstract void turnOn();

	public abstract void turnOff();

	public abstract void setVolume(int volume);

	// 디폴트 메소드
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리");
		} else {
			System.out.println("무음 해제");
		}
	}

	// 정적 메서드
	static void changeBatterry() {
		System.out.println("건전지 교환");
	}

}
