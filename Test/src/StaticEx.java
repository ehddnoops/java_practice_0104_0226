
public class StaticEx {
	
	int field1;
	void method1() {
		
	}
	
	static int field2;
	static void method2() {
		
	}
	
	static {
		//field1();
		//method1();
		field2=10;
		method2();
		
	}
	
	static void Method3() {
//		this.field=10;
//		this.method1();
		
		field2 = 10;
		
		method2();
		
		StaticEx sce= new StaticEx();
		
		sce.field1 = 10;
		sce.method1();
		
	}

}
