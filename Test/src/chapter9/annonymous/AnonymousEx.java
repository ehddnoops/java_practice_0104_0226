package chapter9.annonymous;

public class AnonymousEx {
	public static void main(String[] args) {
		
		Anonymous anony = new Anonymous();
		
		anony.field.wake(); //�͸�ü�ʵ� ���
		anony.method1(); //�͸�ü ���� ���� ���
		
		anony.method2(
				
				new Person() {
					void study() {
						System.out.println("����");
					}
					@Override
					void wake() {
					System.out.println("8�ÿ� �Ͼ��");
					study();
					}
				}
				
			);
	}

}
