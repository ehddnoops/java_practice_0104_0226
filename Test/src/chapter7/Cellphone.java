package chapter7;

public class Cellphone {
	String model;
	String color;
	
//	private String model2;
	
	
	void powerOn() {
		System.out.println("���� ��");
		
	}
	
	void poweroff() {
		System.out.println("���� ��");
		
	}
	
	void bell() {
		System.out.println("��");
		
	}
	
	void sendVoice(String message) {
		System.out.println("������ �޼��� : " + message);
		
	}
	
	void receiveVoice(String message) {
		System.out.println("�޴� �޼��� : " + message);
		
	}
	
	void hangup() {
		System.out.println("����");
		
	}

}
