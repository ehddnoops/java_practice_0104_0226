package chapter9.annonymous;

public class Anonymous2 {
	
	RemoteControl field = new RemoteControl() {

		@Override
		public void trunOn() {
			System.out.println("Tv��");
		}

		@Override
		public void trunOff() {
			System.out.println("Tv��");
		}
		
	};
	
	void method1() {
		
		RemoteControl localvar= new RemoteControl() {

			@Override
			public void trunOn() {
				System.out.println("����� Ŵ");
			}

			@Override
			public void trunOff() {
				System.out.println("����� ��");
			}
			
		};
		localvar.trunOff();
	}
	
	void method2(RemoteControl rc) {
		rc.trunOn();
	}
	
	
	
	
	
	
	
	
	

	
}
