package chapter7.InstanceofEx;

public class InstanceofEx {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
//			System.out.println("�׷���");
			Child child = (Child)parent;
			System.out.println("m-1 Child�� ��ȯ�� ���");
			
		}else {
			System.out.println("m-1 Child�� ��ȯ�� �ȉ��");
		}
	}
	public static void method2(Parent parent) {
		Child child = (Child)parent;
		System.out.println("m-2 Child�� ��ȯ�� ���");
		
		
		
	}

	
	
	
	public static void main(String[] args) {
		Parent parentA = new Child();
//		method1(parentA);
//		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);
		
	}
}
