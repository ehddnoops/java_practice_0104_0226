/**
 * 
 *python c - �Լ�: ��ɹ��� ����, Ŭ���� �ܺο� ��ġ
 *python java - �޼���:  ��ɹ��� ����, Ŭ���� ���ο� ��ġ
 *
 *
 * 
 *
 *
 *
 *
 *
 *
 */
public class Z12_Method {
	public static void main(String[] args) {
		System.out.println("���� �޼��尡 ���۵Ǿ����ϴ�.");
		int x = sum(1,2);
		System.out.println("�޼��忡�� ���ؿ°�"+ x);
		System.out.println(sum(1,2));
		System.out.println("�� : "+ sub(7,5));
		System.out.println("�� : "+ mul(7,5));
		System.out.println("�� : "+ div(7,0));
		System.out.println("������ : "+ mod(7,5));
		
		gogosing();
		gogosing();
		gogosing();
		
		System.out.println("���밪 : " +abs(-3)); // 0�Ǵ� ����� ��ȯ
		System.out.println("�ִ밪 : " +max(5,2)); // �ִ밪 ����
		
		
		System.out.println("���� �޼��尡 ����.");
		
		
//		Math ���а��� �޼��带 ������� Ŭ����
		System.out.println(Math.abs(-8));
		System.out.println(Math.max(2,7));
		
		
		
	}//end of main
/**
 * 
 * @param a��
 * @param b��
 * @return a�� b���� ū�� ���
 */
	
public static int max(int a, int b) {
	return a >= b ? a : b;
}


public static int abs(int a) {
	return a >= 0 ? a : -a;
	}
	
//	if(a >= 0) {
//		retrun a;
//	}
//	else {
//		retrun -a;
//	}
//}


// ������ ���� ���� ���� ����Ÿ���� void�� ����ؾ��Ѵ�.
	public static void gogosing() { // �Ű����� ������ ������ ���� .
		System.out.println("����");
		return ; // ���� ����
	}
/**
 * �μ��� ���� ���ؼ� �����ϴ� �޼���
 * @param i ù��° ����
 * @param j �ι�° ����
 * @return ������ �ΰ��� �Ű������� ������
 */
	public static int mod(int i, int j) {
		// TODO Auto-generated method stub
		return i%j;
	}

	public static int div(int i, int j) {
		int result;
		if(j == 0) {
			System.out.println("�����������ϴ�");
			result = 0;
		}else {
			result = i/j;
		}
		return result;
	
	}
	public static int mul(int i, int j) {
		// TODO Auto-generated method stub
		
		return i*j;
	}
	public static int sub(int a, int b) {
		// TODO Auto-generated method stub
		int c = a - b;
		return c;
	}
	//�Ű����� : ������ ������ ����
	//�ż���� : �ĺ��� ����Ģ�� ������, �޼����� ù���ڴ� �ҹ��ڷ� ����.
	//����Ÿ�� : �޼����� �������� �ǵ����� ���� Ÿ��
	
	public static int sum(int a, int b) { // �޼��� ����
		System.out.println("�μ��� ���� ���ؼ� �����ϴ� �޼����Դϴ�.");
		int c = a + b;
		return c;
	}
	
	
	
	
	
	//		����Ÿ�� �޼���� �Ű�����
//	public int abc    (int a, String b, boolean[] c) {
//		System.out.println();
//		return 3; 
//	}
	
	

}//end of class












