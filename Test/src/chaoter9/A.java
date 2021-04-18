package chaoter9;

public class A {
	class B{
		B(){}
		int field1;
		//static int field2;
		void method1() {}
//		static void method2() {}
	}

}

class C2{
	public static void main(String[] args) {
		
	
	A a = new A();
	A.B b=a.new B();
	
	b.field1=3;
	}
}