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
		//field2 �ʵ�� method3�޼ҵ�� ChildŸ�Կ��� ����Ǿ� �����Ƿ� Parent Ÿ������ �ڵ� Ÿ�� ��ȯ�ϸ� ����� �� ����.
		//field2 �ʵ�� method3�޼ҵ带 ����ϰ��� �ϸ� �ٽ� Child Ÿ������ ���� ��ȯ�ؾ� �Ѵ�.
		
	}

}
