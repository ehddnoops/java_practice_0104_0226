/**
 * 오버로딩 overloading
 *	: 하나의 클래스 안에서 동일한 메서드명을 사용하는 기법
 *	조건 : 매개변수의 개수 or 타입 또는 순서가 달라야한다.
 *
 *
 *
 */
public class Z20_Overloading {
	public static void main(String[] args) {
		
		PPP p = new PPP();
		p.sum(3, 5);
		p.sum(1, 2, 3);
		p.sum(1, 3.14);
		p.sum(3.14, 2);
		
		
		
		
		
	}//end of main

}//end of class

class PPP{
	void sum(int a, int b) {
		System.out.println(a + b);
	}
	void sum(int a, double b) {
		System.out.println(a + b);
	}
	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	void sum(double a, int b) {
		System.out.println(a + b);
	}
}

