/** 
 * ctrl s ����
 * ctrl f11 ������ �� ����
 */
public class z01_Variable {
	public static void main(String[] args) {
		System.out.println("����");
		
//���� �����͸� �޸𸮿� �����ϱ�
/*�� Ÿ��: ������ byte(1), short(2), int(4), long(8)
			�Ǽ��� float(4), double(8)
			������ char(2) ���� �ѱ��� 'a','b','c'
			���� boolean True/False 
*/
		int a = 500;
//		������ ����Ģ
//		������ ����ϸ� �ȵȴ�.
//		�ߺ����� ��� �Ұ�
//		���ڷ� �����ϸ� �ȵȴ�
//		Ư������ _ $ �ΰ����� ����
//		��ҹ��ڰ� ���еȴ�
//		������ ������ ���� 
		int numberOfApple = 3; // �������� ���� �빮�� ���
//		b = 3; <<- �������� ������� �Ұ���
		byte b = 4; //������ ����, �ʱ�ȭ(ó�� �����͸� ����)
		b = 5;
		// �ϳ��� ������ �ϳ��� �����͸� ������ ���� -> �������� ����� �� ���
		System.out.println(b);
		int c;
		c = 12;
		System.out.println(c);
		
		short s = 3;
		
		long x = 1234567890123L; // long Ÿ���� �����Ϳ��� L  or l�� �ٿ���
								// ���ͷ� ���̻� 
//		float f = 3.14;  8����Ʈ ������ 4����Ʈ�� ������ �ϴ� Ÿ���� �̽���Ī �Ǿ ������ ��
		float f = 3.14f; // ���ͷ� ���̻� F or f
		double dd = 3.14;// ���ͷ� ���̻� D or d ��������
		char ch = 'a';
		ch = 'z';
		
		//�� true / ���� false
		
		
		//����: ���Ҽ� �ִ¼�
		//���: ������ ��, ���α׷������ ���� ���� ���ϰ� ���°� final
		//����� ����Ǵ� ����Ģ : ��� �빮�ڷ� ����
		int g = 4;
		g = 5;
		
		final double PI = 3.14; // final ���Ծ��� 
		final int NUMBER_OF_APPLE;
		
		String name = "�赿��";
		
		//���ͷ� ���̻� long, float, double
		
		int y = 5;
		System.out.println(3 + y);
		System.out.println("�ȳ�"+ "����");// ���ڿ��� �������� : �̾�ٿ���
		System.out.println("ab"+ 3);// ���ڿ� + ���ڿ�
		// 				   "ab"+"3" -> ���ڿ� + ���ڿ��� �ٲ㼭 �ν���
		System.out.println("cd"+4+2); //cd42
		System.out.println(3+4+"HI"+3+4); //7HI34
						 //3+4+"HI"+"3"+"4"
		int aa = 3;
		int bb = 5;
		System.out.println(aa+","+bb);//3+5
//swap (��ȯ)

		int temp;
		temp = aa;
		aa = bb;
		bb = temp;
		
		
		System.out.println(aa + "," + bb);// �ڵ��� ����� ��
		// ���� �ڵ��� ����Ұ� �׻�
		// temp ��ȯ���ִ� ���� ǥ���Ҷ� ���� ���°�
		//api document ��� ---> �𸣴°� ã���� gogo
		
		int xx = 1; //3
		int yy = 2; //1
		int zz = 3; //2
		
		int ff;
		ff = xx;
		xx = zz;
		zz = yy;
		yy = ff;
		System.out.println(xx+","+yy+","+zz);
		System.out.println(xx+','+yy+','+zz);
		//���׿����
// �� �ǿ����ڴ� ���� Ÿ���̾�� �Ѵ�. Ÿ���� �ٸ���, �����Ϸ��� ūŸ������ �ڵ�����ȯ ���ش�
// ����� ���� Ÿ������ ���´�
// int�� ���� ���� ������ Ÿ���� ���׿���� int������ ����ȯ�ȴ�
// byte, short, int, char
		byte gg = 3;
		byte hh = 4;
		System.out.println(gg+hh);
		
		char uu = 'a';
		char ww = 'b';
		System.out.println(uu+ww);
		
		
	}//end of main
}//end of class
