package chapter8;

public class MyClass {
	RemoteControl2 rc = new Television();
	
	MyClass(RemoteControl2 rc){
		this.rc=rc;
	}
	
	void methodA() {
		RemoteControl2 rc = new Audio();
	}
	
	
	void methodB(RemoteControl2 rc) {
		
	}
	

}
