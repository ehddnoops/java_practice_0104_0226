package chapter6;

public class Service {
	
	@PrintAnnotation 
	public void method1() {
		System.out.println("���� ����");
	}
	
	@PrintAnnotation("*") 
	public void method2() {
		System.out.println("���� ����2");
	}
	@PrintAnnotation(value = "#",num=20) 
	public void method3() {
		System.out.println("���� ����3");
	}
	
	

}
