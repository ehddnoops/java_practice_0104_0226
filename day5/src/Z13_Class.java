/**
 * Ŭ���� : ����� ���� Ÿ��
 *  (����)����, �޼���, 
 *
 *
 *
 */
public class Z13_Class {
	public static void main(String[] args) {
		int a;//���� ����, �⺻��
		a = 3;//���� �ʱ�ȭ
		int b = 3;//���� ����,�ʱ�ȭ
		
		Cup c;//���� ����, ������
		c = new Cup();
		c.size = 3;
		c.color = "���";
		
		
		Cup c2 = new Cup();// ��������, ��ü���� �ѹ���
		c2.size = 4;
		c2.color = "����";
		
		c.printCup();
		c2.printCup();
		
		
		
	}//end of main

}//end of class 

class Cup{ // Ŭ������ ����
	int size;
	String color;
/**
 * �� Ŭ������ ������ ����ϴ� �ż���
 * @return
 */
	void printCup() {
		System.out.println(size + ", " +color);
	}
}

// ����������
// ��ü������ : class
// ������ modifier























