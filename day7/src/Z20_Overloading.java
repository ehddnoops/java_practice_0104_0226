/**
 * �����ε� overloading
 *	: �ϳ��� Ŭ���� �ȿ��� ������ �޼������ ����ϴ� ���
 *	���� : �Ű������� ���� or Ÿ�� �Ǵ� ������ �޶���Ѵ�.
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

