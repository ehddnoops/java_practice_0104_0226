package chapter7;

public class DmbCellPhone extends Cellphone{
	
	
	
	int channel;
	
	DmbCellPhone(String model, String color, int channel){

//		this.model2 =model2;
		this.model=model;
		this.color=color;
		this.channel =channel;
		
	}
	
	void turnOnDmb() {
		System.out.println(channel);
	}
	
	void change(int channel) {
		this.channel = channel;
		System.out.println(channel);
	}
	
	void turnOffDmb() {
		System.out.println(channel + "Á¾·á");
	}
	
	
	

}
