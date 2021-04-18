package chapter7.package2;

import chapter7.package1.A;

public class D extends A{
	
	//C클래스와는 달리 D는 A의 자식 클래스이다.
	//그렇기 때문에 A클래스의 protected 필드, 생성자, 메서드에 접근 가능
	//단, new 연산자를 사용해서 생성자를 직접 호출할수는 없고,
	//자식 생성자에서 super()로 A 생성자를 호출할 수 있다.
	
	
	public D() {
		super();
		this.field="value";
		this.method();
		
		
	}
	

}
