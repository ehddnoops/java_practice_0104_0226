package chapter7;

public class DmbCellPhoneEx {
	public static void main(String[] args) {
		DmbCellPhone dmb = new DmbCellPhone("�ڹ���","����",10);
		System.out.println(dmb.model);
		System.out.println(dmb.color);
		
		System.out.println(dmb.channel);
		
		dmb.powerOn();
		dmb.receiveVoice("d");
		
		
		
		
		
		
	}

}
