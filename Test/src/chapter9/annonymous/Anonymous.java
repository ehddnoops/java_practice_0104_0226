package chapter9.annonymous;

public class Anonymous {
	//필드 초기값으로 대입
	
	
	Person field=new Person() { // 익명객체필드 사용
		
		void work() {
			System.out.println("출근");
		}
		@Override
		void wake() {
			System.out.println("6시에 일어난다");
			work();
		}
		
	};
	
	void method1() {
		//로컬 변수값으로 대입
		Person localVar = new Person() {
			
			void walk() {
				System.out.println("산책");
			}
			
			@Override
			void wake() {
			System.out.println("7시에 일어난다");
			walk();
			}
			
		};
		localVar.wake(); //로컬 변수 사용
	}
	
	void method2(Person person) {
		person.wake();
	}
	
	
	
	
	

}
