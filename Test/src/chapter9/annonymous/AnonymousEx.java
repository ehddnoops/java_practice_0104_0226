package chapter9.annonymous;

public class AnonymousEx {
	public static void main(String[] args) {
		
		Anonymous anony = new Anonymous();
		
		anony.field.wake(); //익명객체필드 사용
		anony.method1(); //익명객체 로컬 변수 사용
		
		anony.method2(
				
				new Person() {
					void study() {
						System.out.println("공부");
					}
					@Override
					void wake() {
					System.out.println("8시에 일어난다");
					study();
					}
				}
				
			);
	}

}
