/**
 * 				3+4
 * ������   :+ ��ȣ or �ܾ�
 * �ǿ����� : 3, 4
 * ctrl + shift + c = �ش� �� �ּ�
 * // ctrl + alt + ��/�Ʒ� ����Ű : Ŀ���� or ������ �������� ����
 * ctrl shift v : Ŭ�����忡 ���� ������ִ��� Ȯ��
 */
public class z02_Operator {
	public static void main(String[] args) {
//		������
//		����, ����, ����, ���Կ�����
//		���׿����� : �ǿ����� ������ �Ѱ��ΰ�
//			++ -- + !
		int a = 3;
		++a; // ��ġ���������� a = a+1
		a++; // ��ġ���������� a = a+1
		
		a= 3; 
		System.out.println("��ġ����������");
		System.out.println(++a); //4  ���� �� ���
		System.out.println(a);	// 4
		
		a= 3; 
		System.out.println("��ġ����������");
		System.out.println(a++); // <<< �̷��� ���°� ������� �ƴ� ��� �� ����
		System.out.println(a);
		
		a = 3;
		System.out.println(--a); //2
		System.out.println(a);	//2
		
		a = 3;
		System.out.println(a--);//3
		System.out.println(a);//2
		
		a =3;
		System.out.println(-5);
		System.out.println(-a);
		
		boolean b = true;
		System.out.println(b);
		System.out.println(!b);//������ ������: �������� ���갡��, �ݴ�� �ٲ�		
		
//		���׿����� : �ǿ������� ������ �ΰ��ΰ�
//		�ΰ��� �ǿ����ڰ� Ÿ���� ���ƾ� ������ ������.
//		Ÿ���� �ٸ��� ����ū �������� �ڵ� ����ȯ��.
//		���� ����� ���� Ÿ������ ���´�
//		���, ��, ��, ��Ʈ
//		���: + - * / %
		System.out.println(7+3); //10
		System.out.println(7-3);
		System.out.println(7*3);
		System.out.println(7/3);
		System.out.println(7%3);
		

//		�񱳿����� : �������� true / false �� ���´�
//		< > <= >= ==
		System.out.println(3 <= 7);
		System.out.println(3 == 7);
		
//		�� ������ : && || ^         :ȿ������ ������ �Ѵ�
//		�ϳ��� false �� false
		System.out.println("��������");
		System.out.println(true && true); //true
		System.out.println(false && true); //true
		System.out.println(true && false); //true
		System.out.println(false && false); //true
		
//		�ϳ��� true�� true 
		System.out.println(true || true);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(false || false);
		
//		�ΰ��� �ٸ��� true 
		System.out.println(true ^ true);
		System.out.println(false ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ false);
		
		System.out.println(3+4 < 10 && 5*2 == 10);
		
//		���׿�����: �ǿ������� ������ 3���� ������
//				���ǽ�  ? ���ΰ��: �����ΰ��
		int c = 3 < 6 ? 100 : 0;
		System.out.println(c);
//		���� ������ : = �� ���׿������� ����
//		+= -= *= /= %= &=
		a = 3;
		a += 2;
		System.out.println(a);
		a -= 2;
		a *= 2;
		a /= 2;
		a %= 2;
		
//		% ������������ --> �ٲܼ� ������ �ٲٴ°��� ���� ������ �����ɸ�
		int n = 7;
		
		System.out.println(n%2 == 0 ? "¦��" : "Ȧ��");
		System.out.println(n%2 == 1 ? "Ȧ��" : "¦��");
		System.out.println(n%3 == 0 ? "3�ǹ���̴�" : "3�ǹ���� �ƴմϴ�");
		System.out.println(n%7 == 0 ? "����� �Դϴ�" : "������� �ƴմϴ�");
		
//		���� ������ �� ĳ���� ������ (=����ȯ ������)
		
		int f = 5;
		double d = f; // �������� �ս��� ���°��� �ڵ� ����ȯ ���� (������ ����ȯ)
		System.out.println(d);
		d = 3.14;// ������ �߻� ������ �ս��� �߻��ϴ� ���
		f = (int)d; //���� ����ȯ
		System.out.println(f);
		
//		������ �ڵ尪�� �˰� ������, �ڵ尪�� �������� ���ڸ� �˰� ������
		char ch = 'a'; // 97 
		System.out.println((int)ch); //Ÿ�� ��ȯ
		System.out.println((char)98);
		
	}//end of main
}//end of class
