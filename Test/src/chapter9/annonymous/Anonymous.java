package chapter9.annonymous;

public class Anonymous {
	//�ʵ� �ʱⰪ���� ����
	
	
	Person field=new Person() { // �͸�ü�ʵ� ���
		
		void work() {
			System.out.println("���");
		}
		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ��");
			work();
		}
		
	};
	
	void method1() {
		//���� ���������� ����
		Person localVar = new Person() {
			
			void walk() {
				System.out.println("��å");
			}
			
			@Override
			void wake() {
			System.out.println("7�ÿ� �Ͼ��");
			walk();
			}
			
		};
		localVar.wake(); //���� ���� ���
	}
	
	void method2(Person person) {
		person.wake();
	}
	
	
	
	
	

}
