package chapter8;

public class RemoteControlEx {
	public static void main(String[] args) {

		RemoteControl rc = new Television();
		rc.turnOn();
//		rc.turnOff();

		RemoteControl rc1 = new Audio();
		rc.turnOn();
//		rc.turnOff();
		rc1.setMute(true);
		RemoteControl.changeBatterry();
	}

}
