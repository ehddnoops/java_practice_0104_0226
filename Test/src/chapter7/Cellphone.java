package chapter7;

public class Cellphone {
	String model;
	String color;
	
//	private String model2;
	
	
	void powerOn() {
		System.out.println("전원 켬");
		
	}
	
	void poweroff() {
		System.out.println("전원 끔");
		
	}
	
	void bell() {
		System.out.println("벨");
		
	}
	
	void sendVoice(String message) {
		System.out.println("보내는 메세지 : " + message);
		
	}
	
	void receiveVoice(String message) {
		System.out.println("받는 메세지 : " + message);
		
	}
	
	void hangup() {
		System.out.println("끊기");
		
	}

}
