/**
 * ������ : Constructor
 * 		�ʱ�ȭ �޼��� ����
 *		//�⺻������ : Ŭ������� ���� , ����Ÿ�� x
 */
public class Z21_Constructor {
	public static void main(String[] args) {
		Mart m1 = new Mart("Ȩ�÷���",10000,1000);
		Mart m2 = new Mart();
		m2.name = "3��Ʈ"; m2.ball = 10000; m2.pen = 1000;
		
		
		
	}//end of main

}//end of class
















class Mart {
	String name = "";
	int ball;
	int pen;
	
	Mart(){		//�⺻������ : �Ű������� �ϳ��� ���� ������
		
	}
	
	// �������� �����ε� @@@@@@
	
	
	
	//������ �⺻ ��Ģ : ������ ��ġ���� ����� ���� ����� ���� ���� �����Ѵ�.
	Mart(String name, int ball, int pen){// ������
		this.name = name;
		this.ball = ball;
		this.pen = pen;
		
	}
//this : ���ڽ��� ��ü�� ����Ű�� ���� ����
//		�����Ϸ��� �޼���� �����ڿ� ���������� �������ش�
	
	
	void printmart() {
		System.out.printf("%s�� �������� \n��:%d, ��:%d\n",name, ball, pen);
		
		
		
	}
}