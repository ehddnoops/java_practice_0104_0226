package chapter9.annonymous;

class Parents{
	void parentsMethod() {
		
	}
}

class Child extends Parents{
	
}
public class A {
//	Parents field = new Child();
//	
//	void method() {
//		Parents localVar = new Child();
//	}
	Parents field = new Parents() {
		
		int childField;
		void childmethod() {}
		@Override
		void parentsMethod() {
			
			childField=3;
			childmethod();
		}
		
	};
	
	void method() {
//		field.childField=3;
//		field.childMethod();
		field.parentsMethod();
	}
	
	
	
//	void method() {
//		Parents localVar = new Parents() {
//		int childField;
//		void childMethod() {}
//			@Override
//				void parentsMethod() {}// Parents 메소드를 오버라이딩
//		};
//		
		
//	
//	void method1(Parents parent) {}
//	
//	
//	void method2() {
//		
//		method1(
//				new Parents(){
//					int childMethod(){}
//				}
//				
//				);
//			
//			
//		}
//		
//		
//	}
//	
		
	
	
	
	
	
	
	
	
}
