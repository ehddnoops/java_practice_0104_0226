package chapter9.annonymous;

public class Anonymous2 {
	
	RemoteControl field = new RemoteControl() {

		@Override
		public void trunOn() {
			System.out.println("TvÄÔ");
		}

		@Override
		public void trunOff() {
			System.out.println("Tv²û");
		}
		
	};
	
	void method1() {
		
		RemoteControl localvar= new RemoteControl() {

			@Override
			public void trunOn() {
				System.out.println("¿Àµð¿À Å´");
			}

			@Override
			public void trunOff() {
				System.out.println("¿Àµð¿À ²û");
			}
			
		};
		localvar.trunOff();
	}
	
	void method2(RemoteControl rc) {
		rc.trunOn();
	}
	
	
	
	
	
	
	
	
	

	
}
