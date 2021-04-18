package chapter7.Casting;

public class ChildEx {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1="xxx";
		parent.method1();
		parent.method2();
		
//		parent.field2="ttt";
//		parent.method3();
		
		Child child = (Child)parent;
		child.field2="ttt";
		child.method3();
		//field2 필드와 method3메소드는 Child타입에만 선언되어 있으므로 Parent 타입으로 자동 타입 변환하면 사용할 수 없다.
		//field2 필드와 method3메소드를 사용하고자 하면 다시 Child 타입으로 강제 변환해야 한다.
		
	}

}
